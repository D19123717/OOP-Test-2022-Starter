package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
    ArrayList<Nematode> Nematodes = new ArrayList<Nematode>();
    public void keyPressed()
    {
        if (keyCode == LEFT)
        {
        }
    }



	public void settings()
	{
		size(800, 800);
		loadNematodes();
		printNematodes();

	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");

        for(TableRow row:table.rows())
        {
            Nematode Nematode = new Nematode(row);
            Nematodes.add(Nematode);
        }
	}


	public void printNematodes()
    {
        for(Nematode t:Nematodes)
        {
            println(t);
        }
    }
    public void draw()
    {
        background(0);
        displayNematodes();
    }

}
