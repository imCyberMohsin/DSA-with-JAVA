//! 1.Introduction To Java. 

//? Setup & Installation.
//? 1. Install Java Development Kit (JDK)
//      - Search on google, JDK Donwload
//      - Donwload and install JDK
//      - Set the bin folder path in environment variables.
//* 2. Download & Install VScode

// Note:Learn Flowcharts, Psudocode & Algorithm

//? First Java Progaram
class A1_introduction { // class name same as filename
    public static void main(String Args[]) { // main function / method
        System.out.print("HelloWorld"); // print statement
    }
}

// ? Components of JDK
// JDK -> Development Tools, JVM(Libraries), JRE
// JVM -> Libraries, JRE

// * How Java Code Run?
// ? 1. Compilation
// Java Source code(.java) is sent to the compiler of JDK. 
// SourceCode -> Compiler
// Then The Compiler converts the source code into a bytecode(.class).
// Compile(code) -> Bytecode
// Note: Bytecode is OS indepependent, Thus JAVA is called Portable language.
// ? 2. Execution
// Now the bytecode(.class) file is Sent to the JVM Which Converts the bytecode
// into Native-Code(Machine Code).