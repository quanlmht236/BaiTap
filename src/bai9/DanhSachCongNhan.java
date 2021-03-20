package bai9;

import java.util.ArrayList;

public class DanhSachCongNhan {
    private ArrayList<CongNhan> CNList = new ArrayList<>();
    private int maxSize;

    public DanhSachCongNhan(int n) throws Exception
    {
        if (n > 0)
        {
            CNList.ensureCapacity(n);
            maxSize = n;
        }
        else throw new Exception("error!!!!! n must be greater than 0");}
    public boolean add(CongNhan CN)
    {
        if ((CNList.size() == maxSize) )
            return false;
        else
        {
            CNList.add(CN);
            return true;
        }
    }

    @Override
    public String toString() {
        String KQ = "";
        for(int i = 0;i<CNList.size();i++){
            KQ += CNList.get(i).toString() + "\n";
        }
        return KQ;
    }
    public int CalSLCN(){
        return CNList.size();
    }

    public String toString1(){
        for(int i = 0;i<CNList.size();i++){
        if(CNList.get(i).getmSoSP()>199) System.out.println(CNList.get(i).toString());
        }
        return "Xong";
    }
    public void sortZa(){
        CNList.sort((s1, s2) ->
        {
            if (s1.getmSoSP() > s2.getmSoSP())
                return -1;
            else
                return 1;
        });
    }
}
