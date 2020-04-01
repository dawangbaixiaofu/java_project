package com.huwei;

public class distributeBullet {
    public static void main(String[] args) {
        //士兵分子弹
        int[] shibing= {8,4,8};
        Bullet bullet = new Bullet(shibing);
        bullet.fenzidan();

    }
}

class Bullet
{
    public int[] shibing;
    public int total=0; //总子弹数量
    public int times = 0; //分发n次


    public Bullet(int[] shibing)
    {
        this.shibing = shibing;
        for (int i=0;i< shibing.length;i++)
        {
            total += shibing[i];
        }
    }

    public void fenzidan()
    {
        int[] temp = new int[this.shibing.length];
        while(true)
        {
            times++;
            //对每一个士兵的子弹数量进行检查，如果是奇数，则加一
            for(int i=0;i< shibing.length;i++)
            {
                //如果一个士兵的子弹数量是奇数，那么加一
                if (shibing[i]%2!=0)
                {
                    total+=1;
                    temp[i] = (shibing[i]+1)/2;
                }
                else
                    temp[i] = shibing[i]/2;

            }
            //把上一个士兵的一半子弹分给下一个士兵
            for(int i= 0;i<shibing.length;i++)
            {
                if (i>0)
                {
                    shibing[i]=temp[i-1]+temp[i];
                }
                else
                {
                    shibing[0] = temp[0]+temp[shibing.length-1];
                }
            }

            for (int i: shibing)
            {
                System.out.print(i+" ");
            }
            System.out.print("\n");

            //给出分发子弹结束条件
            if (total%shibing.length==0)
            {
                boolean end = false;
                int j = shibing[0];
                for(int i = 0;i<shibing.length;i++)
                {
                    if (j!=shibing[i])
                    {
                        end = false;
                        break;
                    }
                    else
                        end = true;

                }
                if(end)
                {
                    System.out.println("总共分发了"+times+"次！");
                    break;
                }


            }


        }
    }
}