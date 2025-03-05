# Low-Level Design (LLD) Interview Guide

A comprehensive guide to prepare for different types of Low-Level Design interviews in the software industry.

## Table of Contents
- [Types of LLD Interviews](#types-of-lld-interviews)
- [Design Interview Process](#design-interview-process)
- [Machine Coding Interview Process](#machine-coding-interview-process)
- [Case Study: Design a Pen](#case-study-design-a-pen)
- [Design Patterns & Implementation](#design-patterns--implementation)
- [Key Tips for Success](#key-tips-for-success)

## Types of LLD Interviews

### Theoretical
- **Focus**: OOPS concepts & Design Patterns knowledge
- **Format**: Questions & answers
- **Companies**: Traditional tech companies (Oracle, TCS, Infosys)
- **Duration**: 30-45 minutes
- **Assessment**: Design pattern understanding, OOPs principles

### Design
- **Focus**: Problem solving & architecture design
- **Format**: Case study without coding
  - Class diagrams
  - Schema design
- **Companies**: Microsoft, Walmart, Amazon, Google
- **Duration**: 45 minutes
- **Assessment**: Design thinking, architecture skills

### Machine Coding
- **Focus**: Problem solving with working implementation
- **Format**: Case study with code
- **Companies**: Startups and modern tech companies
- **Duration**: 2-2.5 hours
- **Assessment**: Practical coding skills, design implementation

## Design Interview Process
*Typical 45-minute LLD design interview*

1. **Problem Statement** (5 minutes)
   - Single line problem definition
   - Example: "Design a Book My Show system"

2. **Requirements Gathering** (10 minutes)
   - Make suggestions with reasoning rather than just asking questions
   - Identify entities, relationships, constraints
   - Define core functionality

3. **Class Diagram** (10 minutes)
   - Entity relationships
   - Abstract classes & interfaces
   - Design patterns to apply

4. **Schema Design** (5 minutes)
   - Database tables & relationships
   - Key fields & types

5. **Code Implementation** (10-15 minutes)
   - Core functionality
   - A couple of key functions

6. **Discussion** (10-15 minutes)
   - Design choices justification
   - Alternatives considered
   - Optimizations & improvements

## Machine Coding Interview Process
*Typical 2+ hour LLD implementation interview*

1. **Problem Documentation** (30 minutes)
   - Detailed requirements document
   - Constraints & expectations

2. **Requirements Clarification**
   - Don't be shy to ask questions
   - Don't make assumptions when in doubt

3. **Class Diagram**
   - Entity relationships
   - Inheritance hierarchy

4. **Schema Design**
   - Data structure organization

5. **Working Code** (1.5 hours)
   - Full implementation

6. **Discussion** (30 minutes)
   - Code review
   - Design decisions

## Case Study: Design a Pen

### Overview
- Establish correct expectations with interviewer
- Align on problem scope and system type
- Define input/output methods

### Requirements Gathering (Best Practices)
❌ **Don't**: Ask random questions without direction  
✅ **Do**: Make suggestions with reasoning to identify requirements

### Key Requirements Identified
1. Pen can be of different types (ball pen, gel pen, fountain pen)
2. Pen will have properties (price, brand, name)
3. Pen will have a writing mechanism
   - Ball/Gel pens have refills
   - Fountain pens have ink & nib directly
4. Refill contains ink and nib
5. Ink has color property
6. Nib has radius property

### Input Methods Consideration
1. Command line interface
2. Web APIs (Postman or HTTP requests)
   - Entity creation via POST
   - Operations via appropriate HTTP methods

## Design Patterns & Implementation

### Class Diagram
```
Pen (Abstract)
├── properties: price, brand, name
├── writingStrategy: WritingStrategy
├── setWS(WritingStrategy): void
└── write(): void

WritingStrategy (Interface)
└── write(): void

FastWS implements WritingStrategy
└── write(): void

SlowWS implements WritingStrategy
└── write(): void

BallPen extends Pen
└── refill: Refill

GelPen extends Pen
└── refill: Refill

FountainPen extends Pen
├── ink: Ink
└── nib: Nib

Refill
├── ink: Ink
└── nib: Nib

Ink
└── color: String

Nib
└── radius: int
```

### Strategy Pattern Implementation
```java
// Client code
Pen p = new BallPen();
p.setWS(new FastWS());
p.write();

// In Pen class
public void setWS(WritingStrategy obj) {
    this.ws = obj;
}

public void write() {
    if (ws == null) {
        throw new Exception("Writing strategy not defined");
    }
    ws.write();
}
```

### Decorator Pattern Example
Consider adding features to pens like stickers, camera, etc.

```java
// Base structure
Pen
├── BallPen
├── GelPen
├── FountainPen
└── Addon Pens
    ├── StickerAddonPen
    ├── CameraAddonPen
    └── MicAddonPen
```

## Key Tips for Success

1. **Drive the Interview**
   - Make suggestions rather than just asking questions
   - Demonstrate your thought process

2. **Visualize the Problem**
   - Draw sketches when appropriate
   - Use diagrams to explain your thinking

3. **Choose Appropriate Design Patterns**
   - Know when to apply which pattern
   - Be able to explain your choices

4. **Focus on Core Requirements First**
   - Identify 5-8 key requirements
   - Build your design around these

5. **Code Quality Matters**
   - Write clean, maintainable code
   - Handle edge cases appropriately

6. **Demonstrate Technical Depth**
   - Show understanding of OOP principles
   - Apply SOLID principles

---

_This guide is based on real interview experiences at top tech companies._