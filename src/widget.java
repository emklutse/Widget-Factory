/*
 * Factory Class
 */


public class widget
{
    //Establish attributes
    private int numwidgets;
    private int days;

    /**
     * The setNumwidgets method accepts an argument
     * for the numwidget field
     */
    public void setNumwidgets(int n)
    {
        numwidgets = n;
    }

    /**
     * The getTime method returns the amount of time
     * needed to produce the number of widgets entered
     * in the numwidgets field
     */
    public int getTime()
    {
        while (numwidgets > 0)
        {
            numwidgets -= 160;
            days++;
        }
        return days;
    }

}