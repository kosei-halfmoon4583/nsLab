package jp.co.koseihalfmoon;

import	javax.swing.*;
import	javax.swing.text.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import java.awt.event.*;

import jp.co.koseihalfmoon.CSVUriageTemp;
import jp.co.koseihalfmoon.CSVSiireTemp;

/*------------------------------------------------------------------------*
 * Copyright (c) 2016 xxxx, System Planning Office. 
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.x
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * Program Name:	AppDConvertTest [main Class]
 * Contributors:	Naoshi WATANUKI - Initial API and implementation. -
 * Data Written :	2016.8.30 (Tue.)
 * Update Written: 	____.__.__
 *-------------------------------------------------------------------------*/

public class AppDConvertTest extends AppDScreenBase {

	JTextArea textarea;
	public String	LookFeel = metalClassName;
	public String 	fName	= "";

	public static void main(String[] args){
		String name = "xxxx 売上/仕入れ情報 to xxxx システム [ver 0.1.2]";
		int width = 680;
		int height = 300;
		@SuppressWarnings("unused")
		AppDConvertTest ads = new AppDConvertTest(name, width, height);
	}
	/** Constractor */
	AppDConvertTest(String title, int x, int y) {
		super(title, x, y);
			  
		/** メニュー設定 */
		mniConfirm.addActionListener(new MenuItemListener());
		mniOpen.addActionListener(new MenuItemListener());
		mniSave.addActionListener(new MenuItemListener());
		mniExit.addActionListener(new MenuItemListener());
		mniMetal.addActionListener(new MenuItemListener());
		mniMotif.addActionListener(new MenuItemListener());
		mniWindows.addActionListener(new MenuItemListener());
			
		//表示ボタン　クリック時のイベント処理を定義
		//btnDisplay.addActionListener(new BtnDisplay());
			
		//CSV変換ボタン　クリック時のイベント処理を定義 (Dummy)
		btnRegist.addActionListener(new BtnRegister());

		//Closeボタン　クリック時のイベント処理を定義
		btnClose.addActionListener(new BtnClose());
			
	}
	/** CSV変換処理 */
	class BtnRegister implements ActionListener {
		public void actionPerformed(ActionEvent e)	{
			if(fName == "") {
				txtEdit.setForeground(Color.red);
				txtEdit.setText("\n" + " ファイルを選択して下さい！");
			} else {
				txtEdit.setForeground(Color.BLACK);
				txtEdit.setText(fName);
				/* 売上一時ファイル作成 */
				CSVUriageTemp csvrd = new CSVUriageTemp(fName);
				csvrd.readers();
				/* 仕入れ一時ファイル作成 */
				CSVSiireTemp csvst = new CSVSiireTemp(fName);
				csvst.readers();
			}		
		}
	}

	/* Close ボタンが押されたときの処理	*/
	class BtnClose implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//closeF = adrs.getClose();
			System.exit(EXIT_ON_CLOSE);
		}
	}
		
	// -- メニュー関連処理 (Event Listener) ------------
	class MenuItemListener implements ActionListener {
		//JFileChooser の作成
		JFileChooser myFileChooser = new JFileChooser();

		public void actionPerformed(ActionEvent ae) {
			//引数のActionEventのインスタンスから選択されたメニューアイテムを取得
			JMenuItem selectedItem = (JMenuItem)ae.getSource();

			//File Confirm メニューアイテムの処理
			if (selectedItem == mniConfirm) {					
				try {
					UIManager.setLookAndFeel(LookFeel);
					SwingUtilities.updateComponentTreeUI(myFileChooser);
				} catch(Exception ex) {
					ex.printStackTrace();
				}

				int intRet = myFileChooser.showOpenDialog(myContainer);
				if (intRet == JFileChooser.APPROVE_OPTION) {
					try {
						//ダイアログで選択されたファイルのパス名からFileReaderのインスタンスを作成
						FileReader myFReader = new FileReader(myFileChooser.getSelectedFile().getAbsolutePath());

						//FileReader のインスタンスを引数としてBufferedReader のインスタンスを作成
						BufferedReader myBufReader = new BufferedReader(myFReader);

						//read メソッドを使ってテキスト表示エリアにデータを読み出す
						txtEdit.read(myBufReader, new PlainDocument());

						//ストリームのクローズ
						myBufReader.close();
					} catch (IOException ie) {
					}
					//String fName = myFileChooser.getSelectedFile().toString();
					fileSelectLabel.setText(" ");
				}
			}
						
			//File Open メニューアイテム処理
			if (selectedItem == mniOpen) {
				txtEdit.setForeground(Color.black);
				String inputFile = "【入力ファイル】";
				try {
					UIManager.setLookAndFeel(LookFeel);
					SwingUtilities.updateComponentTreeUI(myFileChooser);
				} catch(Exception ex) {
					ex.printStackTrace();
				}
				int intRet = myFileChooser.showOpenDialog(myContainer);
				if (intRet == JFileChooser.APPROVE_OPTION) {
					try {
						fileSelectLabel.setText(" ");
						fName = myFileChooser.getSelectedFile().toString();
						txtEdit.setText("\n");
						txtEdit.append(inputFile + fName);
						
					} catch (Exception oe) {
						oe.printStackTrace();
					}
				}
			}
				
			//File Save メニューアイテムの処理
			if (selectedItem == mniSave) {
				String outputFile = "【出力ファイル】";
				try {
					UIManager.setLookAndFeel(LookFeel);
					SwingUtilities.updateComponentTreeUI(myFileChooser);
				} catch(Exception ex) {
					ex.printStackTrace();
				}

				int intRet = myFileChooser.showSaveDialog(myContainer);
				if (intRet == JFileChooser.APPROVE_OPTION) {
					try {
						//ダイアログで選択されたファイルのパス名からFileWriterのインスタンスを作成
						FileWriter myFWriter = new FileWriter(myFileChooser.getSelectedFile().getAbsolutePath());

						//FileWriter インスタンスを引数にBufferedWriterのインスタンスを作成
						BufferedWriter myBufWriter = new BufferedWriter(myFWriter);

						//txtEdit の内容をファイルに書き込む
						myBufWriter.write(txtEdit.getText());

						String fName = myFileChooser.getSelectedFile().toString();
						txtEdit.append("\n");
						txtEdit.append(outputFile + fName);

						//ストリームのクローズ
						myBufWriter.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			//Exit メニューアイテムの処理
			if (selectedItem == mniExit) {
				System.exit(0);
			}
				
			//Metal メニューアイテムの処理
			if (selectedItem == mniMetal) {
				try {
					UIManager.setLookAndFeel(metalClassName);
					SwingUtilities.updateComponentTreeUI(myContainer);
					LookFeel = metalClassName;
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
			//Motif メニューアイテムの処理
			if (selectedItem == mniMotif) {
				try {
					UIManager.setLookAndFeel(motifClassName);
					SwingUtilities.updateComponentTreeUI(myContainer);
					SwingUtilities.updateComponentTreeUI(myFileChooser);
					LookFeel = motifClassName;
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
			//Windows メニューアイテムの処理
			if (selectedItem == mniWindows) {
				try {
					UIManager.setLookAndFeel(windowsClassName);
					SwingUtilities.updateComponentTreeUI(myContainer);
					LookFeel = windowsClassName;
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}	  
}