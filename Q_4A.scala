object O1 extends App{
    def wage(hours:Int):Int={
        hours*250
    }

    def ot(hours:Int):Int={
        hours*85
    }

    def income(hour1:Int,hour2:Int):Int={
        wage(hour1)+ot(hour2)
    }

    def tax(income:Int):Double={
        income*0.12
    }

    def takeHome(h1:Int,h2:Int):Double={
        income(h1,h2)- tax(income(h1,h2))
    }

    printf("%.2f",takeHome(40,30));
}
