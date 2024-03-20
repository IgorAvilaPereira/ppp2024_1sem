package negocio;

public class Controle {
    private Command[] slots;
    
    public Controle() {
        this.slots = new Command[5];
        for (int i = 0; i < slots.length; i++) {
            this.slots[i] = new NoCommand();
        }
    }

    public Command[] getSlots() {
        return slots;
    }

    public void setSlot(int slotNumber, Command command){
        this.slots[slotNumber] = command;
    }

    public void setSlots(Command[] slots) {
        this.slots = slots;
    }

    public void buttonOnPressed(int slotNumber) {
        this.slots[slotNumber].execute();
    }

    public void buttonOffPressed(int slotNumber) {
        this.slots[slotNumber].undo();
    }


    

}
