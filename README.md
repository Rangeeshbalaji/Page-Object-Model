# Page-Object-Model E2E Automation for E-Commerce

This repository implements an **end-to-end automation framework** for an e-commerce website using **Java**, **Selenium WebDriver**, and the **Page Object Model (POM)** design pattern. The automated flow covers login, adding to cart, checkout, and payment.

---

## 🧩 Project Overview

- **LoginPageObject** — locators for username, password, login button  
- **CartPageObject** — locators for add to cart, cart page, checkout flows  
- **Payment** — methods to fill payment fields (card number, expiry, CVV, name, country), and to place order  
- **MainTest** — a TestNG test class that drives the full scenario (login → add to cart → checkout → payment)  

Your current repo structure is straightforward and clear (all classes under same package).  

---

## ⚙️ Prerequisites & Setup

Before running tests, ensure you have:

- Java (11 or higher recommended)  
- IDE (IntelliJ, Eclipse, etc.)  
- TestNG library added (if not using Maven)  
- Selenium WebDriver & WebDriverManager  
- Git  

If you convert the project to Maven, you’ll also need `pom.xml` for managing dependencies.

---

## ▶️ How to Run the Test

You can run the test in two ways:

1. **Via IDE**  
   - Open `MainTest.java`  
   - Right-click `allTest()`  
   - Select *Run with TestNG*

2. **Via TestNG suite** (if you later add a `testng.xml`)  
   - Execute the suite from IDE or command line  

---

## ✅ Test Scenario Coverage

1. Open browser and navigate to login page  
2. Enter credentials and log in  
3. Add a product to cart  
4. Navigate to cart and click checkout  
5. Fill in payment details: card number, expiry month/year, CVV, name  
6. Select country  
7. Place the order  
8. Validate the order confirmation  

---

## 📈 Suggested Improvements

Here are a few next steps you can take to make your automation framework more robust and scalable:

| Enhancement | Benefit |
|-------------|---------|
| **Maven/Gradle setup** | Manages dependencies easily and standardises project structure |
| **testng.xml file** | Allows grouping and parameterization of tests |
| **Base test & driver management class** | Centralises WebDriver setup/teardown logic |
| **Page action methods (not just locators)** | Encapsulate interactions (e.g. `loginPage.login(username, password)`) |
| **Explicit waits & better synchronisation** | Avoids `Thread.sleep` and makes tests more stable |
| **Reporting (Extent, Allure, etc.)** | Rich HTML reports of test runs |
| **Configuration file / properties file** | Store environment URLs, user credentials, timeouts externally |
| **Parallel execution / cross-browser** | Scale tests across browsers and machines |

---

## 🛠️ Example Updated README (Complete)

Here’s a version you can paste directly into your repo:

```md
# Page-Object-Model Automation for E-Commerce

This repository automates an end-to-end e-commerce flow using **Java**, **Selenium WebDriver**, and the **Page Object Model (POM)** design pattern. The flow covers login, adding to cart, checkout, and payment.

---

## 📁 Project Structure

src/
└─ main/java/
├ LoginPageObject.java
├ CartPageObject.java
├ Payment.java
└ MainTest.java
README.md

yaml
Copy code

---

## 🛠 Prerequisites

- Java 11+  
- TestNG  
- Selenium WebDriver  
- WebDriverManager  
- IDE (IntelliJ, Eclipse)  
- Git  

---

## ▶ Running Tests

1. Open `MainTest.java`  
2. Right-click and run with TestNG  
3. (If you add `testng.xml`) run via suite file  

---

## ✅ Automated Flow

1. Navigate to login page  
2. Perform login  
3. Add a product to cart  
4. Proceed to checkout  
5. Enter payment details (card, expiry, CVV, name)  
6. Select country  
7. Place the order  

---

## 🔧 Improvements You Can Add

- Add `pom.xml` for dependency management  
- Introduce `testng.xml` for test suites  
- Write base setup / teardown class  
- Encapsulate page actions instead of exposing WebElements  
- Replace `Thread.sleep` with explicit waits  
- Add reporting (Extent, Allure)  
- Use config file (properties / YAML)  
- Enable parallel / cross-browser execution  

---

## 🤝 Contributing

Fork this repo → add features or fix bugs → raise a pull request.

---

## 📜 License

Licensed under MIT License.
