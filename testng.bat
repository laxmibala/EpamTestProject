set projectLocation=C:\Program Files (x86)\Jenkins\workspace\SeleniumWithTestNG\src\test\resources

cd %projectLocation%

mvn clean test -DsuiteXmlFile=testng.xml