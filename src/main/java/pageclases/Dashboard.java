package pageclases;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eco.base.BaseClass;
import com.eco.base.JavaScriptOperation;

//import com.eco.base.BaseClass;
//import com.eco.base.JavaScriptOperation;

public class Dashboard extends BaseClass {
	WebDriver ndriver;
	WebDriverWait wait;
	JavaScriptOperation js;

	public Dashboard(WebDriver odriver) {
		this.ndriver = odriver;
		PageFactory.initElements(ndriver, this);
		wait = new WebDriverWait(ndriver, Duration.ofSeconds(30));
		js=new JavaScriptOperation(ndriver);

	}

	@FindBy(xpath="(//img[@class='SSicon center-center'])[1]")
	private WebElement operationalExcellence;

	@FindBy(xpath="//button[@class='add-wrap _add-wrap']")
	private WebElement addDashBoard ;

	@FindBy(xpath="//input[@id='dashboard-name']")
	private WebElement enterNameFiled ;

	@FindBy(xpath="//button[text()='Create']")
	private WebElement createBtn ;

	@FindBy(xpath="//i[@class='fas fa-ellipsis-v']")
	private WebElement ellipsisVerticalIcon ;

	@FindBy(xpath="//button[normalize-space()='Add Widget']")
	private WebElement addWidget ;
	
    @FindBy(xpath="//button[normalize-space()='+ Add New Widget']")
	private WebElement addNewWidget ;

	@FindBy(xpath="//i[@class='fas fa-chart-pie']")
	private WebElement piechartWidgetApp ;

	@FindBy(xpath="//button[text()='Add']")
	private WebElement addBtn ;

	@FindBy(xpath="//input[@name='widget_name']")
	private WebElement widgetNameField ;

	@FindBy(xpath="//textarea[@name='widget_description']")
	private WebElement widgetDescription ;

	@FindBy(xpath="//select[@name='period']")
	private WebElement period ;

	@FindBy(xpath="//input[@name='from']")
	private WebElement fromField ;

	@FindBy(xpath="//input[@class='form-control-sm form-control']")
	private WebElement alias ;

	@FindBy(xpath="(//div[@class='css-1wy0on6 selectionbox_prefix__indicators'])[1]")
	private WebElement location;

	@FindBy(xpath="(//div[@class='css-1wy0on6 selectionbox_prefix__indicators'])[2]")
	private WebElement parameter ;

	@FindBy(xpath="//input[@type='color']")
	private WebElement color ;

	@FindBy(xpath="//div[@class='widget-preview-header-refresh']")
	private WebElement refreshPreview ;

	@FindBy(xpath="//a[@class='trigger level-0']")
	private WebElement piechartEllipsisVerticalIcon ; 

	@FindBy(xpath="(//div[text()='Action'])[1]")
	private WebElement  action;
	
	@FindBy(xpath="(//div[text()='Action'])[2]")
	private WebElement  copyPieAction;

	@FindBy(xpath="//div[@class='dropdown-menu level-1 _show']/a[text()='Clone']")
	private WebElement clone ;

	@FindBy(xpath="//div[text()=' Pie Chart - Copy']")
	private WebElement piechartCopyText ;

	@FindBy(xpath="(//a[@class='trigger level-0'])[2]")
	private WebElement  copyPiechartEllipsisVerticalIcon;

	@FindBy(xpath="//div[@class='dropdown-menu level-1 _show']/a[text()='Delete']")
	private WebElement  deleteCopyPie;

	@FindBy(xpath="//button[text()='Ok']")
	private WebElement okBtn ;

	@FindBy(xpath="//div[@class='dropdown-menu level-1 _show']/a[text()='TV Mode']")
	private WebElement tvMode ;

	@FindBy(xpath="//div[@class='add-widget-app-name' and text()='Sensor Health']")
	private WebElement  sensorHealth;

	@FindBy(xpath="//span[text()='Pie Chart']")
	private WebElement piechartname  ;
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusIcon  ;
	
	@FindBy(xpath="")
	private WebElement editDashboard  ;
	
	@FindBy(xpath="")
	private WebElement anomallyDetectionApp  ;

//	@FindBy(xpath="")
//	private WebElement  period ;

	@FindBy(xpath="")
	private WebElement  dataFrequency ;

	@FindBy(xpath="")
	private WebElement  threshouldPercent ;

	@FindBy(xpath="")
	private WebElement trainingWeek  ;

//	@FindBy(xpath="")
//	private WebElement   ;
//
//	@FindBy(xpath="")
//	private WebElement   ;

	@FindBy(xpath="")
	private WebElement  toggle ;
	
	@FindBy(xpath="")
	private WebElement  saveChanges ;
	
	@FindBy(xpath="")
	private WebElement   download;
	
	@FindBy(xpath="")
	private WebElement  setting ;
	
	@FindBy(xpath="")
	private WebElement  unifiedDatePicker ;
	
	@FindBy(xpath="")
	private WebElement  updateBtn ;

	public void createDashboard(String dashBoardName) throws Exception
	{
		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
		try {
			applyExplicitWaitsUntilElementClickable(addDashBoard,30).click();
			}
			catch(Exception e) {
				js.click(addDashBoard);
			}
//		

		applyExplicitWaitsUntilElementClickable(enterNameFiled,30).click();
		applyExplicitWaitsUntilElementClickable(enterNameFiled,30).sendKeys(dashBoardName);
		applyExplicitWaitsUntilElementClickable(createBtn,30).click();
	}


	public void addWidget() throws Exception
	{
		ndriver.findElement(By.xpath("//img[@src='/app/assets/images/operational-excellence.svg']")).click();
		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
		ndriver.findElement(By.xpath("//div[@class='dashboard-list-litem _active']")).click();
		ndriver.findElement(By.xpath("//img[@src='/app/assets/images/operational-excellence.svg']")).click();
		ndriver.findElement(By.xpath("//div[@class='dashboard-list-litem _active']//div[@class='option-wrap dropdown-box']")).click();
		
		
//		applyExplicitWaitsUntilElementClickable(ellipsisVerticalIcon,30).click();
//		Thread.sleep(1000);
//		applyExplicitWaitsUntilElementClickable(addWidget,40).click();
//		Thread.sleep(1000);
		
//		applyExplicitWaitsUntilElementClickable(piechartWidgetApp,30).click();
//		applyExplicitWaitsUntilElementClickable(addBtn,30).click();

/*add code copy piechart text and paste in name and description field		
 String widgetName =piechartname.getText();
 */
		
//		applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys("Pie Chart");                //here program stop
//		applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys("Pie Chart");
//
//		applyExplicitWaitsUntilElementClickable(fromField,30).sendKeys("10");
//		applyExplicitWaitsUntilElementClickable(alias,30).sendKeys("a11");
//		applyExplicitWaitsUntilElementClickable(location,30).click();
//		ndriver.findElement(By.xpath("//div[@id='react-select-4-option-0-0']")).click();
//		applyExplicitWaitsUntilElementClickable(parameter,30).click();
//		ndriver.findElement(By.id("react-select-5-option-55")).click();
//		applyExplicitWaitsUntilElementClickable(color,30).click();
//		ndriver.findElement(By.xpath("//div[@style='background-color: rgb(18, 74, 184);']")).click();
//
//		
//		applyExplicitWaitsUntilElementClickable(refreshPreview,30).click();
//		Thread.sleep(1000);
//		applyExplicitWaitsUntilElementClickable(addWidget,30).click();

//		

	}

	public void cloneTheWidgetAndDeleteClone() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(piechartEllipsisVerticalIcon,30).click();
		applyExplicitWaitsUntilElementClickable(action,30).click();

		applyExplicitWaitsUntilElementClickable(clone,30).click();
		boolean s = isWebElementDisplayed(piechartCopyText);
		if(s)
		{
			System.out.println("widget clone succefully");
		}
		else {
			System.out.println("widget not clone succefully");

		}

		applyExplicitWaitsUntilElementClickable(copyPiechartEllipsisVerticalIcon,30).click();
		applyExplicitWaitsUntilElementClickable(copyPieAction, 30).click();
		applyExplicitWaitsUntilElementClickable(deleteCopyPie, 30).click();
		applyExplicitWaitsUntilElementClickable(okBtn, 30).click();


	}
	//check tvMode

	public void newWidget() throws Exception
	{

		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
		applyExplicitWaitsUntilElementClickable(ellipsisVerticalIcon,30).click();
		applyExplicitWaitsUntilElementClickable(addWidget,30).click();
		applyExplicitWaitsUntilElementClickable(sensorHealth,30).click();
		applyExplicitWaitsUntilElementClickable(addBtn,30).click();
		
	
		applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys("Sensor Health");
		applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys("Sensor Health");  //get the text of sensor or copy it 
		
		
		
		applyExplicitWaitsUntilElementClickable(refreshPreview,30).click();
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(addWidget,30).click();
		

	}
	
//	public void editDashboard()
//	{
//		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
//		applyExplicitWaitsUntilElementClickable(ellipsisVerticalIcon,30).click();
//		applyExplicitWaitsUntilElementClickable(,30).click();                               //editDashboard
//		applyExplicitWaitsUntilElementClickable(addNewWidget,30).click();                             //+Addnewwidget
//		applyExplicitWaitsUntilElementClickable(,30).click();                             //appAbnormallyDetection
//		applyExplicitWaitsUntilElementClickable(,30).click();                             //addbtn
//		applyExplicitWaitsUntilElementClickable(widgetName,30).sendKeys("");                        //widgetname
//		applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys("");                        //description
//		applyExplicitWaitsUntilElementClickable(,30).click();                             //period
//		ndriver.findElement(By.id("")).click();                                           //select period as week
//		
//		applyExplicitWaitsUntilElementClickable(,30).click();                             //datafreq
//		ndriver.findElement(By.id("")).click();                                            //select 60 min
//		
//		applyExplicitWaitsUntilElementClickable(,30).click();                             //enter thres
//		applyExplicitWaitsUntilElementClickable(,30).sendKeys("50");                                            //50
//		                                      
//		
//		applyExplicitWaitsUntilElementClickable(,30).click();                             //trainigWeek
//		applyExplicitWaitsUntilElementClickable(,30).sendKeys("2");                                         //2
//		
//		
//		applyExplicitWaitsUntilElementClickable(,30).click();                             //select qa12
//		ndriver.findElement(By.id("")).click();                
//		
//		applyExplicitWaitsUntilElementClickable(,30).click();                             //select kwh
//		ndriver.findElement(By.id("")).click(); 
//		
//		
//		applyExplicitWaitsUntilElementClickable(,30).click();                       //togglebtn click
//		
//		applyExplicitWaitsUntilElementClickable(refreshPreview,30).click();
//		Thread.sleep(1000);
//		applyExplicitWaitsUntilElementClickable(addWidget,30).click();
//		
//		applyExplicitWaitsUntilElementClickable(,30).click();                           //click save changes
//		
//	}
//	
//	
//	public void downloadWidgetData()
//	{ 
//		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
//		applyExplicitWaitsUntilElementClickable(ellipsisVerticalIcon,30).click();
//		applyExplicitWaitsUntilElementClickable(,30).click();                               //download
//		ndriver.findElement(By.id("")).click();                                                //image
//		applyExplicitWaitsUntilElementClickable(,30).click();                           //ok  btn
//		Thread.sleep(2000);
//		applyExplicitWaitsUntilElementClickable(ellipsisVerticalIcon,30).click();
//		applyExplicitWaitsUntilElementClickable(,30).click();                               //download
//		ndriver.findElement(By.id("")).click();                                                //pdf
//		applyExplicitWaitsUntilElementClickable(,30).click();                           //ok  btn
//		Thread.sleep(2000);
//	}
//	
//	public void settingOfDashboard()
//	{
//		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
//		applyExplicitWaitsUntilElementClickable(ellipsisVerticalIcon,30).click();
//		applyExplicitWaitsUntilElementClickable(,30).click();                               //setting
//		applyExplicitWaitsUntilElementClickable(,30).click();                               //unified picker
//		applyExplicitWaitsUntilElementClickable(,30).click();                               //update
//
//
//	}
//	





}


