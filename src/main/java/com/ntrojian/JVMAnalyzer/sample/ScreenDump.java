package com.ntrojian.JVMAnalyzer.sample;

import javassist.*;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.analysis.ControlFlow;
import javassist.bytecode.analysis.FramePrinter;

/**
 * Created by Nate on 2/23/16.
 */
public class ScreenDump {
    public static void main(String[] args) {
        if(args.length < 2)
            usage();
        String className = args[0];
        CtClass clazz;
        CtMethod method;
        ControlFlow cf;
        //InstructionPrinter print = new InstructionPrinter(System.out);
        FramePrinter print = new FramePrinter(System.out);
        ClassPool cp = ClassPool.getDefault();
        try {
            clazz = cp.get(className);
            for(int i=1; i<args.length; i++) {
                System.out.println("------------------------");
                System.out.println(args[i]);
                method = clazz.getDeclaredMethod(args[i]);
                print.print(method);
                cf = new ControlFlow(method);
                printArr(cf.dominatorTree());
            }
        } catch(NotFoundException e) {
            e.printStackTrace();
        } catch(BadBytecode bb) {
            bb.printStackTrace();
        }
    }

    public static void usage() {
        throw new IllegalArgumentException("usage: ScreenDump <classname> <methodname>");
    }

    private static void printArr(Object[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
