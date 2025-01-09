# Custom Exception Handling in Java - Heisenberg's Uncertainty Principle

This assignment demonstrates the use of **custom exception handling** in Java by applying it to a practical, real-world example: **Heisenberg's Uncertainty Principle**. The program allows users to calculate either the uncertainty in position or the uncertainty in momentum based on user input and the principle's formula. Custom exceptions are used to handle invalid inputs for these uncertainties.

---

## 📜 **Heisenberg's Uncertainty Principle**
The principle states:
> **ΔX × ΔP ≥ h / (4π)**

Where:
- **ΔX** = Uncertainty in position
- **ΔP** = Uncertainty in momentum
- **h** = Planck's constant (6.62607015 × 10⁻³⁴ J·s)

---

## 🛠️ **Features**
1. **Custom Exception Handling:**
   - `InvalidUncertaintyOfMomentumException` for invalid momentum values.
   - `InvalidUncertaintyOfPositionException` for invalid position values.

2. **User-Friendly Input:**
   - Choose to calculate either ΔX or ΔP.
   - Input validation ensures correctness.

3. **Precise Calculation:**
   - Uses Java's `Math.PI` for accuracy.
   - Results displayed in scientific notation.

---

## 🚀 **How It Works**
### Custom Exceptions
- **InvalidUncertaintyOfMomentumException:**  
  Thrown when the uncertainty of momentum (ΔP) is invalid (≤ 0).  

- **InvalidUncertaintyOfPositionException:**  
  Thrown when the uncertainty of position (ΔX) is invalid (≤ 0).

### Methods
- **`UncertaintyInPosition(double delta_P):`**  
  Calculates ΔX when given ΔP. Throws `InvalidUncertaintyOfMomentumException` for invalid ΔP.

- **`UncertaintyInMomentum(double delta_x):`**  
  Calculates ΔP when given ΔX. Throws `InvalidUncertaintyOfPositionException` for invalid ΔX.

---

## 📖 **Usage**

1. Compile the program:
   ```bash
   javac Assignment2_2222756042.java
   ```

2. Run the program:
   ```bash
   java Assignment2_2222756042
   ```

3. Follow the on-screen prompts to calculate:
   - Uncertainty in position (ΔX)
   - Uncertainty in momentum (ΔP)

### Example Input & Output:
#### Input:
```text
What do you want to calculate?
1. Uncertainty Of Position(delta_X)
2. Uncertainty Of Momentum(delta_P)

Enter input: 1
Enter uncertainty of momentum(delta_P) in kgm/s: -5
```

#### Output:
```text
Here is an Exception: InvalidUncertaintyOfMomentumException: -5.0
```

#### Input:
```text
What do you want to calculate?
1. Uncertainty Of Position(delta_X)
2. Uncertainty Of Momentum(delta_P)

Enter input: 2
Enter uncertainty of position(delta_X) in kgm/s: 2.637E-24
```

#### Output:
```text
Uncertainty in momentum (delta_P) is: 1.999567344797414E-11 kgm/s
```

---

## 💂️ **Assignment Structure**
```plaintext
.
├── Assignment2_2222756042.java
└── README.md
```

---

## 📚 **Key Learnings**
1. Creating custom exceptions by extending the `Exception` class.
2. Utilizing constructors and the `toString` method for meaningful exception messages.
3. Practical application of exception handling in scientific calculations.

---

## 🔮 **Dependencies**
- Java Development Kit (JDK 8 or higher)

---

## 💡 **Improvements**
- Add support for additional error handling (e.g., non-numeric input).
- Extend the program to handle multiple scientific formulas.

---

## 🔗 **License**
This assignment is licensed under the MIT License. Feel free to use and modify.

---

## 👤 **Author**
- **ID:** 2222756042
- **Course:** CSE215 || Faculty: CFA || Spring'23

