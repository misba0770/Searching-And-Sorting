class Marks implements Comparable<Marks>{
    int phy;
    int chem;
    int math;
    Marks(){
        
    }
    Marks(int phy,int chem,int math){
        this.phy=phy;
        this.chem=chem;
        this.math=math;
    }
    public int compareTo(Marks o){
        if(this.phy!=o.phy){
            return this.phy-o.phy;
        }
        else if(this.chem!=o.chem){
            return o.chem-this.chem;
        }
        else{
          return  this.math-o.math;
        }
    }
}
class Solution
{
    
    public void customSort (int phy[], int chem[], int math[], int n)
    {
        // your code here
        
        Marks[] arr=new Marks[n];
        for(int i=0;i<n;i++){
            arr[i]=new Marks(phy[i],chem[i],math[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            phy[i]=arr[i].phy;
            chem[i]=arr[i].chem;
            math[i]=arr[i].math;
        }
    }
}
