# POC_FITneese
Deploy the code as Jar . 

Download fitneese from http://fitnesse.org/FitNesseDownload (Provided in this project as well)

Run fitneese and unpack jar using : 

java -jar selenium-server-standalone-3.0.1.jar -port 1212

OPen fitneese @ localhost:1234



After that Change front page to following : 

======================================================================

!1 Welcome to [[FitNesse][FitNesse.FitNesse]]!
!3 ''The fully integrated stand-alone acceptance testing framework and wiki.''

# Here is a good place to add your first page (WikiWord). For example, MyTopLevelApplicationPage
To add your first "page", click the [[Edit][FrontPage?edit]] button and add a [[!-WikiWord-!][FitNesse.UserGuide.WikiWord]] to the page.

| '''To Learn More...'''|
| [[A One-Minute Description][FitNesse.UserGuide.OneMinuteDescription]]|''What is [[FitNesse][FitNesse.FitNesse]]? Start here.''|
| [[A Two-Minute Example][FitNesse.UserGuide.TwoMinuteExample]]|''A brief example. Read this one next.''|
| [[User Guide][FitNesse.UserGuide]]|''Answer the rest of your questions here.''|
| [[Acceptance Tests][FitNesse.SuiteAcceptanceTests]]|''FitNesse's suite of Acceptance Tests''|
| [[Release Notes][FitNesse.ReleaseNotes]]|''Find out about FitNesse's new features''|

>SimpleClassTest
>SimpleJarTest

!note Release ${FITNESSE_VERSION}




===========================================

After that Add following to SimpleClassTest

==========================================================================
!define TEST_SYSTEM {slim}

!path "Specify the path of your class" e.g. C:\wspace\test\target\classes

!path "Specify path of any jar " e.g. D:\\selenium-standalone-3.7.1.jar for selenium 

| POC_FIT.fitneese.UITest |
|url|  getTitle? |
|www.google.com|Google|




=======================================================

Once this is done you can click on Test and it will start running your program 
