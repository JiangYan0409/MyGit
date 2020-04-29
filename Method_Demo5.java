package com.itheima.demo;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Method_Demo5 {
    public static void main(String argv[]){
        System.out.println("To My tie zi:");
        System.out.println("要快乐哦,我会一直陪着你的！");
        for(float y = (float) 1.5;y>-1.5;y -=0.1)
        {
            for(float x= (float) -1.5;x<1.5;x+= 0.05)
            {
                float a = x*x+y*y-1;
                if((a*a*a-x*x*y*y*y)<=0.0)
                {
                    if(Math.abs(x+0.100000712)<=1e-6 && Math.abs(y-0.6999998)<=1e-6)
                    {
                        System.out.print("H");
                        continue;
                    }
                    if(Math.abs(x+0.050000306)<=1e-6 && Math.abs(y-0.6999998)<=1e-6)
                    {
                        System.out.print("A");
                        continue;
                    }
                    if(Math.abs(x+-3.0621885E-7)<=1e-6 && Math.abs(y-0.6999998)<=1e-6)
                    {
                        System.out.print("P");
                        continue;
                    }
                    if(Math.abs(x-0.049999695)<=1e-6 && Math.abs(y-0.6999998)<=1e-6)
                    {
                        System.out.print("P");
                        continue;
                    }
                    if(Math.abs(x-0.100000001)<=1e-6 && Math.abs(y-0.6999998)<=1e-6)
                    {
                        System.out.print("Y");
                        continue;
                    }

                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }

            for(float x= (float) 1.5;x<4.5;x+= 0.05)
            {
                float a = (x-3)*(x-3)+y*y-1;
                boolean flag = false;
                if((a*a*a-(x-3)*(x-3)*y*y*y)<=0.0)
                {
                    if(Math.abs(x-3+0.100000712)<=1e-6 && Math.abs(y-0.6999998)<=1e-6)
                    {
                        System.out.print("B");
                        flag = true;
                        continue;
                    }
                    if((Math.abs(x-2.9499986)) <= 1e-6 && Math.abs(y-0.6999998)<=1e-6 )
                    {
                        System.out.print("I");
                        continue;
                    }
                    if(Math.abs(x-2.9999986)<=1e-6 && Math.abs(y-0.6999998)<=1e-6)
                    {
                        System.out.print("R");
                        continue;
                    }
                    if(Math.abs(x-3.0499985)<=1e-6 && Math.abs(y-0.6999998)<=1e-6)
                    {
                        System.out.print("T");
                        continue;
                    }
                    if(Math.abs(x-3.0999985)<=1e-6 && Math.abs(y-0.6999998)<=1e-6)
                    {
                        System.out.print("H");
                        continue;
                    }

                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }

            System.out.print("\n");
        }
        Print();
    }
    public static void Print()
    {
        BufferedImage image = new BufferedImage(200, 50, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        g.setFont(new Font("楷体", Font.BOLD, 30));
        g.drawString("生日快乐", 2, image.getHeight() - 20);
        int[] p = image.getRGB(0, 0, image.getWidth(), image.getHeight(), new int[image.getWidth() * image.getHeight()],
                0, image.getWidth());
        char[] cs = { '生', '日', '快', '乐' };
        int ics = 0;
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                int off = i * image.getWidth() + j;
                if (p[off] != 0) {
                    System.out.print(cs[ics]);
                    ics = (ics + 1) % 4;
                } else {
                    System.out.print("　");
                }
                if (j == image.getWidth() - 1) {
                    System.out.println();
                }
            }
        }

    }
}


