package bai8;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
public class CDList {
    private ArrayList<CD> cDList = new ArrayList<>();
    private int maxSize;
    private boolean similarMaCD(CD cD){
        for(int i=0; i<cDList.size();i++){
            if (cD.getMaCD()==cDList.get(i).getMaCD())
                return true;
        } return false;
    }

    public CDList(int n) throws Exception
    {
        if (n > 0)
        {
            cDList.ensureCapacity(n);
            maxSize = n;
        }
        else throw new Exception("error!!!!! n must be greater than 0");}


        public boolean add(CD cD)
    {
        if ((cDList.size() == maxSize) || similarMaCD(cD))
            return false;
        else
        {
            cDList.add(cD);
            return true;
        }
    }
    public int soLuongCD()
    {
        return cDList.size();
    }

    public String TotalPrice()
    {

        double Total = 0.0;
        for (int i = 0; i < cDList.size(); i++)
        {
            Total += cDList.get(i).getPrice();
        }
        Locale local = new Locale("vi","VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String currency =formatter.format(Total);
        return currency;
    }

    @Override
    public String toString()
    {
        String result = "";
        for (int i = 0; i < cDList.size(); i++)
        {
            result += cDList.get(i).toString() + "\n";
        }
        return result;
    }
    public void sortZaPrice()
    {
         cDList.sort((s1, s2) ->
        {
            if (s1.getPrice() > s2.getPrice())
                return -1;
            else
                return 1;
        });
    }
    public void sortAzTuaCd()
    {
        cDList.sort((s1, s2) ->
        {
            return s1.getTuaCD().compareTo(s2.getTuaCD());
        });
    }

}
