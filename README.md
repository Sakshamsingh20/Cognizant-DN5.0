# 🚀 Cognizant Digital Nurture 5.0 — Java FSE Deep Skilling

![Cognizant](https://img.shields.io/badge/Cognizant-Digital%20Nurture%205.0-blue)
![Java](https://img.shields.io/badge/Java-1.8-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.14-green)
![Status](https://img.shields.io/badge/Status-In%20Progress-yellow)

---

## 📌 About This Repository

This repository contains all mandatory hands-on exercises for the **Cognizant Digital Nurture 5.0 — Java Full Stack Engineer (FSE)** program (Campus Hiring 2027).

All exercises are implemented in **Java** using **Eclipse IDE** and organized week-wise for easy navigation.

---

## 📁 Repository Structure

```
COGNIZANT/
├── src/
│   ├── main/java/
│   │   ├── com/cognizant/                              # Week 1 Exercises
│   │   │   ├── designpatterns/                         # Design Patterns & Principles
│   │   │   │   ├── SingletonPattern.java
│   │   │   │   └── FactoryMethodPattern.java
│   │   │   │
│   │   │   ├── algorithms/                             # Data Structures & Algorithms
│   │   │   │   ├── EcommerceSearch.java
│   │   │   │   └── FinancialForecasting.java
│   │   │   │
│   │   │   ├── junit/                                  # TDD using JUnit5
│   │   │   │   ├── Calculator.java
│   │   │   │   ├── StringUtils.java
│   │   │   │   └── BankAccount.java
│   │   │   │
│   │   │   ├── mockito/                                # TDD using Mockito
│   │   │   │   ├── ProductRepository.java
│   │   │   │   ├── ProductService.java
│   │   │   │   ├── EmailSender.java
│   │   │   │   └── NotificationService.java
│   │   │   │
│   │   │   └── slf4j/                                  # SLF4J Logging
│   │   │       └── LoggingExample.java
│   │   │
│   │   ├── com/cognizant/week2/                        # Week 2 Exercises
│   │   │   ├── springcore/                             # Spring Core & Maven
│   │   │   │   ├── AppConfig.java
│   │   │   │   ├── GreetingService.java
│   │   │   │   ├── MainApp.java
│   │   │   │   ├── Vehicle.java
│   │   │   │   ├── VehicleService.java
│   │   │   │   ├── DependencyInjectionApp.java
│   │   │   │   └── MavenProjectApp.java
│   │   │   │
│   │   │   └── springdatajpa/                          # Spring Data JPA + Hibernate
│   │   │       ├── Student.java
│   │   │       ├── StudentRepository.java
│   │   │       └── SpringDataJPAApp.java
│   │   │
│   │   ├── com/cognizant/week3/                        # Week 3 Exercises
│   │   │   └── SpringRest/                             # Spring REST using Spring Boot
│   │   │       ├── SpringRestApp.java
│   │   │       ├── HelloController.java
│   │   │       ├── Country.java
│   │   │       └── CountryController.java
│   │   │
│   │   └── com/cognizant/week4/                        # Week 4 Exercises
│   │       ├── jwt/                                    # JWT Authentication
│   │       │   └── (coming soon)
│   │       └── microservices/                          # Microservices
│   │           ├── accountservice/
│   │           │   ├── Account.java
│   │           │   └── AccountController.java
│   │           └── loanservice/
│   │               ├── Loan.java
│   │               └── LoanController.java
│   │
│   └── test/java/
│       └── com/cognizant/                              # Unit Tests
│           ├── junit/
│           │   ├── CalculatorTest.java
│           │   ├── StringUtilsTest.java
│           │   └── BankAccountTest.java
│           └── mockito/
│               ├── ProductServiceTest.java
│               └── NotificationServiceTest.java
│
└── pom.xml                                             # Maven Dependencies
```

---

## ✅ Completed Exercises

### 📦 Week 1

#### 🎨 Design Principles & Patterns
| Exercise | File | Status |
|----------|------|--------|
| Implementing the Singleton Pattern | `SingletonPattern.java` | ✅ Done |
| Implementing the Factory Method Pattern | `FactoryMethodPattern.java` | ✅ Done |

#### 🔍 Data Structures & Algorithms
| Exercise | File | Status |
|----------|------|--------|
| E-commerce Platform Search Function | `EcommerceSearch.java` | ✅ Done |
| Financial Forecasting | `FinancialForecasting.java` | ✅ Done |

#### 🧪 TDD using JUnit5 & Mockito
| Exercise | File | Status |
|----------|------|--------|
| Setting Up JUnit | `CalculatorTest.java` | ✅ Done |
| Assertions in JUnit | `StringUtilsTest.java` | ✅ Done |
| AAA Pattern, Fixtures, Setup & Teardown | `BankAccountTest.java` | ✅ Done |
| Mocking and Stubbing | `ProductServiceTest.java` | ✅ Done |
| Verifying Interactions | `NotificationServiceTest.java` | ✅ Done |

#### 📋 SLF4J Logging Framework
| Exercise | File | Status |
|----------|------|--------|
| Logging Error Messages & Warning Levels | `LoggingExample.java` | ✅ Done |

---

### 📦 Week 2

#### 🌱 Spring Core & Maven
| Exercise | File | Status |
|----------|------|--------|
| Configuring a Basic Spring Application | `MainApp.java` | ✅ Done |
| Implementing Dependency Injection | `DependencyInjectionApp.java` | ✅ Done |
| Creating and Configuring a Maven Project | `MavenProjectApp.java` | ✅ Done |

#### 🗄️ Spring Data JPA with Hibernate
| Exercise | File | Status |
|----------|------|--------|
| Spring Data JPA — Quick Example | `SpringDataJPAApp.java` | ✅ Done |

---

### 📦 Week 3

#### 🌐 Spring REST using Spring Boot
| Exercise | File | Status |
|----------|------|--------|
| Hello World RESTful Web Service | `HelloController.java` | ✅ Done |
| REST - Country Web Service | `CountryController.java` | ✅ Done |
| REST - Get Country by Code | `CountryController.java` | ✅ Done |

---

### 📦 Week 4

#### 🔐 JWT Authentication
| Exercise | File | Status |
|----------|------|--------|
| Create Authentication Service returning JWT | `coming soon` | 🔄 In Progress |

#### 🏗️ Microservices with Spring Boot & Spring Cloud
| Exercise | File | Status |
|----------|------|--------|
| Account Microservice | `AccountController.java` | ✅ Done |
| Loan Microservice | `LoanController.java` | ✅ Done |

---

### 📦 Pending

| Module | Exercise | Status |
|--------|----------|--------|
| JWT Authentication | Authentication Service | 🔄 In Progress |
| PL/SQL Programming | Control Structures | ⬜ Pending |
| PL/SQL Programming | Stored Procedures | ⬜ Pending |
| React | Hands-on Lab 1-4 | ⬜ Pending |

---

## 🛠️ Technologies Used

| Technology | Version |
|------------|---------|
| Java | 1.8 |
| Spring Boot | 2.7.14 |
| Spring Core | 5.3.29 |
| Spring Data JPA | 2.7.14 |
| Hibernate | 5.6.15 |
| H2 Database | In-memory |
| JUnit | 5.10.0 |
| Mockito | 4.8.1 |
| SLF4J | 1.7.36 |
| Maven | 3.x |

---

## ⚙️ How to Run

1. **Clone the repository**
```bash
git clone https://github.com/Sakshamsingh20/Cognizant-DN5.0.git
```

2. **Open in Eclipse**
   - File → Import → Maven → Existing Maven Projects
   - Browse to cloned folder → Finish

3. **Update Maven**
   - Right click project → Maven → Update Project

4. **Run any exercise**
   - Navigate to the class
   - Right click → Run As → Java Application

5. **Run tests**
   - Right click test class → Run As → JUnit Test

6. **Test REST APIs**
   - Run `SpringRestApp.java`
   - Open browser and test:
     - `http://localhost:8080/api/hello`
     - `http://localhost:8080/api/countries`
     - `http://localhost:8080/api/accounts`
     - `http://localhost:8080/api/loans`

---

## 📅 Timeline

| Milestone | Date |
|-----------|------|
| Program Start | June 18, 2026 |
| Progress Check | July 1, 2026 |
| Full Completion Deadline | July 28, 2026 |

---

## 📞 Connect With Me

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Saksham%20Singh-blue?logo=linkedin)](https://www.linkedin.com/in/saksham-singh-aug/)
[![GitHub](https://img.shields.io/badge/GitHub-Sakshamsingh20-black?logo=github)](https://github.com/Sakshamsingh20)
