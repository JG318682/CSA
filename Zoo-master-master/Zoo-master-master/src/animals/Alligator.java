package animals;

import types.Reptile;


public class Alligator extends Reptile
{
    private String age;

    public Alligator()
    {
        super("Alligator", "Has lots of teeth and nice jaw line");
        this.age = "Crusty Old";
    }

    @Override
    public String eat(){
        return "Eats deer meat";
    }
    public String makeNoise()
    {
        return "Slithering and snapping huge jaws";
    }
    
}
