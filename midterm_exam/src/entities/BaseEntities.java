package entities;

import java.util.ArrayList;

public class BaseEntities {
    private ArrayList<LogIn> log;
    private ArrayList<Register> registers;

    public BaseEntities() {
    }

    public BaseEntities(ArrayList<LogIn> log, ArrayList<Register> registers) {
        this.log = log;
        this.registers = registers;
    }

    public ArrayList<LogIn> getLog() {
        return log;
    }

    public void setLog(ArrayList<LogIn> log) {
        this.log = log;
    }

    public ArrayList<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(ArrayList<Register> registers) {
        this.registers = registers;
    }

    @Override
    public String toString() {
        return "BaseEntities{" +
                "log=" + log +
                ", registers=" + registers +
                '}';
    }
}
