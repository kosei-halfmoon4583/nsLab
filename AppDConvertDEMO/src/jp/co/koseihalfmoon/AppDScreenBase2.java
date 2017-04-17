package jp.co.koseihalfmoon;import	java.awt.*;import	javax.swing.*;public class AppDScreenBase2 extends JFrame {	//コンテナのインスタンスを初期化	Container myContainer = null;		protected	JLabel		LabelCopyright;	//CopyRight Label	protected	JLabel		fileSelectLabel;	protected	JLabel		cloudixLogo;	//Cloudix Logo	protected	JButton		btnRegist;		//CSV変換ボタン	protected	JButton		btnClose;		//Close ボタン	protected	JTextArea	txtEdit;		//各項目表示エリア	//protected   JTextField	txtID;			//*未使用	protected	JPanel		myPanel1;		//Frame（上部）	protected	JPanel		myPanel2;		//Frame（中央）	protected	JPanel		myPanel3;		//Frame（下部）	protected	JMenuItem	mniOpen;		//Menu item (開く:Open)	protected	JMenuItem	mniConfirm;		//Menu item (File内容の確認:Confirm)	protected	JMenuItem	mniSave;		//Menu item (保存:Save)	protected	JMenuItem	mniExit;		//Menu item (閉じる:Close)	protected	JMenuItem	mniMetal;		//Menu item (Metal)	protected	JMenuItem	mniMotif;		//Menu item (Motif)	protected	JMenuItem	mniWindows;		//Menu item (Windows)	protected	ImageIcon	iCon;		//Componentで使用するFontを設定	private final Font LabelFont0 = new Font("Dialog", Font.TRUETYPE_FONT, 12);	private final Font LabelFont1 = new Font("MS ゴシック", Font.TRUETYPE_FONT+Font.BOLD, 12);	//private final Font LabelFont2 = new Font("MS Pゴシック", Font.TRUETYPE_FONT, 12);	//Frameの概観(Look and Feel) の定義    static String metal= "Metal(M)";    static String metalClassName = "javax.swing.plaf.metal.MetalLookAndFeel";    static String motif = "Motif(T)";    static String motifClassName = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";    static String windows = "Windows(W)";    static String windowsClassName = "apple.laf.AquaLookAndFeel";    //WindowsOSの場合は下記のコードに変更する    //static String windowsClassName = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";    //Message Defines	static String errMessage001 = "登録すべき項目がありません！";	static String errTitle001   = "[Error Message 001]";	static String fileSelect	= " 入力ファイルを選択して下さい";    /* Reference:: You can use following Border style if you create the JButton component ----*   		blackline 		= setBorder(BorderFactory.createLineBorder(Color.black));		raisedetched 	= setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));		loweredetched 	= setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));		raisedbevel 	= setBorder(BorderFactory.createRaisedBevelBorder());		loweredbevel 	= setBorder(BorderFactory.createLoweredBevelBorder());		empty 			= setBorder(BorderFactory.createEmptyBorder());	/-----------------------------------------------------------------------------------------*/	public AppDScreenBase2(String title, int x, int y) {	/** Constructor 1 [main constructor] */				super(title);		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		this.setScreenItem();		this.setScreenMenu();		//Frame 定義		this.setSize(x, y);		//Frame 表示位置をDeskTop中央にセット        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();        this.setLocation((screenSize.width - x)/2,(screenSize.height - y)/2);		//Frame 表示		this.setVisible(true);	}	public AppDScreenBase2() {	/** Constructor 2 [sub constructor] */				super("For test");		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		this.setScreenItem();		this.setScreenMenu();		//Frame 定義		int width = 500;		int height = 270;		this.setSize(width, height);		//Frame の表示位置をDeskTop中央にセット        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();        this.setLocation((screenSize.width - width)/2,(screenSize.height - height)/2);		//Frame 表示		this.setVisible(true);		//txtEdit.requestFocus();	/* Focus set */	}	public void setScreenItem() {		//コンテンツ区画を取得		myContainer = this.getContentPane();		//レイアウト設定		myContainer.setLayout(new BorderLayout());		//パネル作成		myPanel1 = new JPanel();		myPanel2 = new JPanel();		myPanel3 = new JPanel();				//パネル・レイアウトを設定		//myPanel1.setLayout(new GridLayout(2, 3));		myPanel1.setLayout(new GridLayout(1, 4));		myPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));		myPanel3.setLayout(new GridLayout(4, 1));				//テキストエリアを設定（テキストエリアに折り返しを許可する）		txtEdit = new JTextArea();		txtEdit.setLineWrap(true);		//スクロールペインを作成し、テキストエリアをはめ込む		JScrollPane myScroll = new JScrollPane(txtEdit);		//コンテナにスクロールペインを追加		myContainer.add(myScroll, BorderLayout.CENTER);		//ラベル作成		LabelCopyright 			= new JLabel("      " + "Copyright (C). 2016 All Right Reserved by Softbank C&S");		LabelCopyright.setFont(LabelFont1);				//icon(logo)		//ImageIcon	iCon = new ImageIcon("/Users/watanukitadashi/Downloads/Images/cloudix_logo.png");		ImageIcon	iCon = new ImageIcon("./resources/cloudix_logo.png");		cloudixLogo = new JLabel(iCon);		fileSelectLabel = new JLabel(fileSelect);		myPanel1.add(fileSelectLabel);		myPanel2.add(cloudixLogo);		myPanel2.add(LabelCopyright);		//CSV変換ボタン		btnRegist = new JButton("CSV変換");		btnRegist.setFont(LabelFont0);		//Closeボタン		btnClose = new JButton("終　了");		btnClose.setToolTipText("Program End  Good Bye!");		btnClose.setFont(LabelFont0);		//パネルにボタンを追加		myPanel3.add(btnRegist);		myPanel3.add(btnClose);		//コンテナにパネルを追加		myContainer.add(myPanel1, BorderLayout.NORTH);		myContainer.add(myPanel2, BorderLayout.SOUTH);		myContainer.add(myPanel3, BorderLayout.EAST);	}	public void setScreenMenu() {		/*----------------------------------------------/		/ << メニュー設定 >>								/		/----------------------------------------------*/		//File Open メニューアイテム		mniOpen = new JMenuItem("開く(O)");		mniOpen.setMnemonic('o');		//File Confirm メニューアイテム		mniConfirm	=	new JMenuItem("File確認(D)");		mniConfirm.setMnemonic('d');		//FileSave メニューアイテム		mniSave =	new JMenuItem("保存(S)");		mniSave.setMnemonic('s');		//Exit メニューアイテム		mniExit =	new JMenuItem("閉じる(C)");		mniExit.setMnemonic('x');		//File メニュー作成		JMenu mnuMenu =	new JMenu("ファイル(F)");		mnuMenu.setMnemonic('F');		//File メニューに各アイテムを追加		mnuMenu.add(mniOpen);		mnuMenu.add(mniConfirm);		mnuMenu.add(mniSave);		mnuMenu.addSeparator();		mnuMenu.add(mniExit);		//Metal Look&Feel メニューアイテムを作成		mniMetal = new JMenuItem("Metal (M)");		mniMetal.setMnemonic('M');				//Motif Look&Feel メニューアイテムを作成		mniMotif = new JMenuItem("Motif (T)");		mniMotif.setMnemonic('t');				//Windows Look&Feel メニューアイテムを作成		mniWindows = new JMenuItem("Windows (W)");		mniWindows.setMnemonic('w');		//Look&Feel メニューの作成		JMenu mnuView = new JMenu("Look&Feel (L)");		mnuView.setMnemonic('l');				//View メニューに各アイテムを追加		mnuView.add(mniMetal);		mnuView.add(mniMotif);		mnuView.add(mniWindows);		//メニューバーを作成		JMenuBar mnbMenuBar = new JMenuBar();		//メニューバーにメニューを追加		mnbMenuBar.add(mnuMenu);		mnbMenuBar.add(mnuView);		//コンテナにメニューバーを追加		this.setJMenuBar(mnbMenuBar);	}}