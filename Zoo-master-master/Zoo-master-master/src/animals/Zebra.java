package animals;

import types.Equine;

public class Zebra extends Equine
{
    private String age;

    public Zebra()
    {
        super("Zebra", "Has stripes of black and white");
        this.age = "A young stud";
    }

    @Override
    public String makeNoise()
    {
        return "Neighs and makes donkey noises to";
    }
}
