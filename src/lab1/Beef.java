package lab1;

public class Beef extends Food {
    private String _filling1 = null;

    public Beef(String filling1) {
        super("Beef", 250);
        _filling1 = filling1;
    }


    public String get_filling1() {
        return _filling1;
    }
    private void set_filling1(String filling1) { _filling1 = filling1; }

    @Override
    public void consume() {
        System.out.println(get_name() + " Eaten!");
    }

    @Override
    public int calculateCalories() {
        if (get_filling1().equals("With blood"))
            set_calories(get_calories() + 20);
        else if (get_filling1().equals("Normal"))
            set_calories(get_calories() + 100);
        else if (get_filling1().equals("Fried"))
            set_calories(get_calories() + 130);

        return get_calories();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Beef)) return false;
        return (_filling1.equals(((Beef) obj)._filling1));
    }

    @Override
    public String toString(){
        return get_filling1() + " " + super.toString() ;
    }
}
