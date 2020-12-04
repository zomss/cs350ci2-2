/**
 * @name Simple Java Calculator
 * @file UI.java
 * @author SORIA Pierre-Henry
 * @copyright Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;


import java.io.*;

public class UI implements ActionListener {

    /**
     * frame.
     */
    private final JFrame frame;
    /**
     * panel that contains panelSub 1 to 8.
     */
    private final JPanel panel;
    /**
     * panelSub 1 that contains input text area.
     */
    private final JPanel panelSub1;
    /**
     * panelSub 2 that contains 1, 2, 3, add, minus.
     */
    private final JPanel panelSub2;
    /**
     * panelSub 3 that contains 4, 5, 6, multiply, divide.
     */
    private final JPanel panelSub3;
    /**
     * panelSub 4 that contains 7, 8, 9, equal, cancel.
     */
    private final JPanel panelSub4;
    /**
     * panelSub 5 that contains 0.
     */
    private final JPanel panelSub5;
    /**
     * panelSub 6 that contains square, squareroot, onedevidedby, xpowerofy.
     */
    private final JPanel panelSub6;
    /**
     * panelSub 7 that contains cos, sin, tan.
     */
    private final JPanel panelSub7;
    /**
     * panelSub 8 that contains log, rate, abs, binary.
     */
    private final JPanel panelSub8;

    /**
     * text area for calculation inputs.
     */
    private final JTextArea text;
    /**
     * array of buttons.
     */
    private final JButton[] but;
    /**
     * button for Add.
     */
    private final JButton butAdd;
    /**
     * button for Minus.
     */
    private final JButton butMinus;
    /**
     * button for Rate.
     */
    private final JButton butMultiply;
    /**
     * button for Divide.
     */
    private final JButton butDivide;
    /**
     * button for Equal.
     */
    private final JButton butEqual;
    /**
     * button for Cancel.
     */
    private final JButton butCancel;
    /**
     * button for SquareRoot.
     */
    private final JButton butSquareRoot;
    /**
     * button for Rate.
     */
    private final JButton butSquare;
    /**
     * button for devide by(maybe divide by).
     */
    private final JButton butOneDevidedBy;
    /**
     * button for cos.
     */
    private final JButton butCos;
    /**
     * button for sin.
     */
    private final JButton butSin;
    /**
     * button for tan.
     */
    private final JButton butTan;
    /**
     * button for Rate.
     */
    private final JButton butxpowerofy;
    /**
     * button for log.
     */
    private final JButton butlog;
    /**
     * button for rate.
     */
    private final JButton butrate;
    /**
     * button for absolute.
     */
    private final JButton butabs;
    /**
     * button for binary.
     */
    private final JButton butBinary;
    /**
     * button for calc.
     */
    private final Calculator calc;

    /**
     * string array for button values.
     */
    private static final String[] buttonValue = {"0", "1", "2", "3", "4", "5", "6",
            "7", "8", "9"};

    /**
     * font for plain font.
     */
    private final Font font;
    /**
     * font for bold font.
     */
    private final Font textFont;
    /**
     * number of button 0 ~ 9 is 10.
     */
    private static final int buttonNum = 10;

    /***
     * UI() @throws IOException.
     * UI that creates frame, pannel, buttons.
     */
    public UI() throws IOException {

        final int plainfontSize = 18;
        final int boldfontSize = 24;
        final int textareaRow = 1;
        final int textareaCol = 30;

        frame = new JFrame("Calculator PH");

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panelSub1 = new JPanel(new FlowLayout());
        panelSub2 = new JPanel(new FlowLayout());
        panelSub3 = new JPanel(new FlowLayout());
        panelSub4 = new JPanel(new FlowLayout());
        panelSub5 = new JPanel(new FlowLayout());
        panelSub6 = new JPanel(new FlowLayout());
        panelSub7 = new JPanel(new FlowLayout());
        panelSub8 = new JPanel(new FlowLayout());


        font = new Font("Consolas", Font.PLAIN, plainfontSize);

        text = new JTextArea(textareaRow, textareaCol);

        textFont = new Font("Consolas", Font.BOLD, boldfontSize);

        but = new JButton[buttonNum];
        for (int i = 0; i < buttonNum; i++) {
            but[i] = new JButton(String.valueOf(i));
        }
        butAdd = new JButton("+");
        butMinus = new JButton("-");
        butMultiply = new JButton("*");
        butDivide = new JButton("/");
        butEqual = new JButton("=");
        butSquareRoot = new JButton("sqrt");
        butSquare = new JButton("x*x");
        butOneDevidedBy = new JButton("1/x");
        butCos = new JButton("Cos");
        butSin = new JButton("Sin");
        butTan = new JButton("Tan");
        butxpowerofy = new JButton("x^y");
        butlog = new JButton("log10(x)");
        butrate = new JButton("x%");
        butabs = new JButton("abs(x)");
        butCancel = new JButton("C");
        butBinary = new JButton("Bin");

        calc = new Calculator();

    }

    /***
     * init().
     * Init function for UI.
     */
    public void init() {

        final int frameSize = 450;
        final int buttonWidth = 15;
        final int planeWidth = 100;
        final int bigplaneWidth = 210;
        final int firstBut = 1;
        final int secondBut = 2;
        final int thirdBut = 3;
        final int forthBut = 4;
        final int fifthBut = 5;
        final int sixthBut = 6;
        final int seventhBut = 7;
        final int eighthBut = 8;
        final int ninthBut = 9;
        final int zeroBut = 0;

        frame.setSize(frameSize, frameSize);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        text.setFont(textFont);
        text.setEditable(false);

        for (int i = 0; i < buttonNum; i++) {
            but[i].setFont(font);
        }
        butAdd.setFont(font);
        butMinus.setFont(font);
        butMultiply.setFont(font);
        butDivide.setFont(font);
        butEqual.setFont(font);
        butSquareRoot.setFont(font);
        butSquare.setFont(font);
        butOneDevidedBy.setFont(font);
        butCos.setFont(font);
        butSin.setFont(font);
        butTan.setFont(font);
        butxpowerofy.setFont(font);
        butlog.setFont(font);
        butrate.setFont(font);
        butabs.setFont(font);
        butCancel.setFont(font);
        butBinary.setFont(font);

        panel.add(Box.createHorizontalStrut(planeWidth));
        panelSub1.add(text);
        panel.add(panelSub1);

        panelSub2.add(but[firstBut]);
        panelSub2.add(but[secondBut]);
        panelSub2.add(but[thirdBut]);
        panelSub2.add(Box.createHorizontalStrut(buttonWidth));
        panelSub2.add(butAdd);
        panelSub2.add(butMinus);
        panel.add(panelSub2);

        panelSub3.add(but[forthBut]);
        panelSub3.add(but[fifthBut]);
        panelSub3.add(but[sixthBut]);
        panelSub3.add(Box.createHorizontalStrut(buttonWidth));
        panelSub3.add(butMultiply);
        panelSub3.add(butDivide);
        panel.add(panelSub3);

        panelSub4.add(but[seventhBut]);
        panelSub4.add(but[eighthBut]);
        panelSub4.add(but[ninthBut]);
        panelSub4.add(Box.createHorizontalStrut(buttonWidth));
        panelSub4.add(butEqual);
        panelSub4.add(butCancel);
        panel.add(panelSub4);

        panelSub5.add(but[zeroBut]);
        panelSub5.add(Box.createHorizontalStrut(bigplaneWidth));
        panel.add(panelSub5);

        panelSub6.add(butSquare);
        panelSub6.add(butSquareRoot);
        panelSub6.add(butOneDevidedBy);
        panelSub6.add(butxpowerofy);
        panel.add(panelSub6);

        panelSub7.add(butCos);
        panelSub7.add(butSin);
        panelSub7.add(butTan);
        panel.add(panelSub7);

        panelSub8.add(butlog);
        panelSub8.add(butrate);
        panelSub8.add(butabs);
        panelSub8.add(butBinary);
        panel.add(panelSub8);

        for (int i = 0; i < buttonNum; i++) {
            but[i].addActionListener(this);
        }
        butAdd.addActionListener(this);
        butMinus.addActionListener(this);
        butMultiply.addActionListener(this);
        butDivide.addActionListener(this);
        butSquare.addActionListener(this);
        butSquareRoot.addActionListener(this);
        butOneDevidedBy.addActionListener(this);
        butCos.addActionListener(this);
        butSin.addActionListener(this);
        butTan.addActionListener(this);
        butxpowerofy.addActionListener(this);
        butlog.addActionListener(this);
        butrate.addActionListener(this);
        butabs.addActionListener(this);
        butBinary.addActionListener(this);

        butEqual.addActionListener(this);
        butCancel.addActionListener(this);

        frame.add(panel);
    }

    /***
     * actionPerformed(final Actionevent e).
     * Determine the actions when buttons are pushed.
     */
    @SuppressWarnings("checkstyle:MethodParamPad")
    @Override
    public void actionPerformed(final ActionEvent e) {
        final Object source = e.getSource();

        for (int i = 0; i < buttonNum; i++) {
            if (source == but[i]) {
                text.replaceSelection(buttonValue[i]);
                return;
            }
        }

        if (source == butAdd) {
            writer(calc.calculateBi(Calculator.BiOperatorModes.add, reader()));
        }

        if (source == butMinus) {
            writer(calc.calculateBi(Calculator.BiOperatorModes.minus,
                    reader()));
        }

        if (source == butMultiply) {
            writer(calc.calculateBi(Calculator.BiOperatorModes.multiply,
                    reader()));
        }

        if (source == butDivide) {
            writer(calc
                    .calculateBi(Calculator.BiOperatorModes.divide, reader()));
        }
        if (source == butxpowerofy) {
            writer(calc.calculateBi(Calculator.BiOperatorModes.xpowerofy,
                    reader()));
        }

        if (source == butSquare) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.square,
                    reader()));
        }

        if (source == butSquareRoot) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.squareRoot,
                    reader()));
        }

        if (source == butOneDevidedBy) {
            writer(calc.calculateMono(
                    Calculator.MonoOperatorModes.oneDevidedBy, reader()));
        }

        if (source == butCos) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.cos,
                    reader()));
        }

        if (source == butSin) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.sin,
                    reader()));
        }

        if (source == butTan) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.tan,
                    reader()));
        }
        if (source == butlog) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.log,
                    reader()));
        }
        if (source == butrate) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.rate,
                    reader()));
        }
        if (source == butabs) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.abs,
                    reader()));
        }

        if (source == butEqual) {
            writer(calc.calculateEqual(reader()));
        }

        if (source == butCancel) {
            writer(calc.reset());
        }

        if (source == butBinary) {
            parsetoBinary();
        }

        text.selectAll();
    }

    private void parsetoBinary() {
        try {
            text.setText(
                    "" + Long.toBinaryString(Long.parseLong(text.getText())));
        } catch (NumberFormatException ex) {
            logger.log("Error while parse to binary." + extoString());
        }
    }

    /***
     * reader().
     * @return
     * reader that reads from text and returns the value of it.
     */
    public Double reader() {
        Double num;
        String str;
        str = text.getText();
        num = Double.valueOf(str);

        return num;
    }

    /***
     * writer(final Double num).
     * @param num
     * writer that set the text.
     */
    public void writer(final Double num) {
        if (Double.isNaN(num)) {
            text.setText("");
        } else {
            text.setText(Double.toString(num));
        }
    }
}
