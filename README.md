
# Selenium – JavaScriptExecutor
![Java](https://img.shields.io/badge/java-%23ED8B.svg?style=for-the-badge)
![Selenium](https://img.shields.io/badge/selenium-%797979.svg?style=for-the-badge)

Read the complete Blog - [How to use JavaScriptExecutor in Selenium](https://testingwithsk.in/how-to-use-javascriptexecutor-in-selenium/)

In this article, you will learn about how JavaScriptExecutor works in selenium. Basically, JavaScriptExecutor is an Interface that allows you to execute JavaScript through the Selenium web driver. It is a medium that allows a web driver to interact with the HTML elements of a webpage. It provides two methods i.e. executeScript and executeAsyncScript, to execute JavaScript on a selected webPage.
## JavaScriptExecutor Methods
- ExecuteAsyncScript
- ExecuteScript

### ExecuteAsyncScript
This method executes an asynchronous piece of JavaScript on the current webpage. With the asynchronous script, web pages render very quickly, Instead of waiting for the script to download before the page renders which enhances the application performance.
You can find the [ImplicitWaitTest](https://github.com/TestingWithSK/selenium-wait-demo/blob/master/src/test/java/test/ImplicitWaitTest.java)
class inside `src/test/java/test`.

### ExecuteScript
This method executes JavaScript in the context of the currently selected webpage or window. The script in this method runs in the body of an anonymous function. This script can return WebElement, long, Boolean, list, or String.
You can find the [ExplicitWaitTest](https://github.com/TestingWithSK/selenium-wait-demo/blob/master/src/test/java/test/ExplicitWaitTest.java)
class inside `src/test/java/test`.

### Clone the repository using -

```shell
git clone https://github.com/TestingWithSK/selenium-javascript-executor-example.git
```

### Run the Test Case -

- [x] Right click on any java file inside `src/test/java/example` and select -  `Run '<FILE_NAME>'`

  
Read the complete Blog - [How to use JavaScriptExecutor in Selenium](https://testingwithsk.in/how-to-use-javascriptexecutor-in-selenium/)

Happy Testing!!!

---

### Read More Articles
[![Testing Blog](https://img.shields.io/badge/-TestingWithSK-21759B?logo=wordpress&logoColor=white)](https://testingwithsk.in)

### Follow us on Social Media Accounts
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://linkedin.com/in/shubhamkgupta14)
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/testingwithsk)
[![Facebook](https://img.shields.io/badge/Facebook-%231877F2.svg?logo=Facebook&logoColor=white)](https://facebook.com/testingwithsk)