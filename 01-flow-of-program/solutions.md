# 📘 Flowchart and Pseudocode Practice

This repository contains basic flowchart and pseudocode exercises for foundational programming logic.

---

## 📌 Questions

1. **Input a year and find whether it is a leap year or not.**
2. **Take two numbers and print the sum of both.**
3. **Take a number as input and print the multiplication table for it.**
4. **Take 2 numbers as inputs and find their HCF and LCM.**
5. **Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.**

---

## ✅ Answers

### 1. Input a year and find whether it is a leap year or not.

**Pseudocode:**

```
Start
    input year
    if year % 4 = 0 and year modulo 100 != 0 or year modulo 400 = 0
        print leap year
    else
        print not a leap year
End
```

---

### 2. Take two numbers and print the sum of both.

**Pseudocode:**

```
Start
    input number1, number2
    sum = number1 + number2
    print sum
End
```

---

### 3. Take a number as input and print the multiplication table for it.

**Pseudocode:**

```
Start
    input number
    for i = 0; i <= 12;
        print number * i
        i++
End
```

---

### 4. Take 2 numbers as inputs and find their HCF and LCM.

**Pseudocode:**

```
Start
    input number1 and number2
    store number1 in temp1
    store number2 in temp2

    while temp2 ≠ 0
        remainder = temp1 modulo temp2
        temp1 = temp2
        temp2 = remainder
    end while

    HCF = temp1
    LCM = (number1 * number2) / HCF

    print HCF and LCM
End
```

---

### 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

**Pseudocode:**

```
Start
    sum = 0
    loop
        input value
        if value = 'x'
            break loop
        else
            convert value to integer
            sum = sum + value
    end loop
    print sum
End
```