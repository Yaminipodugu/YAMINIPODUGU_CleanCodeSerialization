package epam;

public class HouseConstructionCost {
	
public double estimateCost(String material,double area,boolean fullyAutomated)
{
if(material.equals("standardMaterial") && fullyAutomated == false)
{
return 1200*area;
}
else if(material.equals("aboveStandardMaterial") && fullyAutomated == false)
{
return 1500*area;
}
else if(material.equals("highStandardMaterial") && fullyAutomated == false)
{
return 1800*area;
}
else
{
return 2500*area;
}
}

public double findSimpleInterest(double Principle,double time,double rate)
{
return (Principle*time*rate)/100;
}
public double findCompoundInterest(double Principle,double time,double rate,boolean yearly)
{
if(yearly)
{
return Principle*(Math.pow(1+(rate/100),time)-1);

}
else
{
return Principle*(Math.pow(1+((rate/2)/100),2*time)-1);
}
}

public static void main(String[] args)
{
	// TODO Auto-generated method stub
	HouseConstructionCost hs = new HouseConstructionCost();
	System.out.println("The cost for the construction is:  Rs " + hs.estimateCost("standardMaterial", 300.0, false));
	System.out.println("The cost for the construction is:  Rs" + hs.estimateCost("aboveStandardMaterial", 100.0, false));
	System.out.println("The cost for the construction is:  Rs" + hs.estimateCost("highStandardMaterial", 150.0, false));
	System.out.println("The cost for the construction is:  Rs" + hs.estimateCost("highStandardMaterial", 200.0, true));
	Simpleandcompound cs = new Simpleandcompound();
	System.out.println("Simple Interest is : " + cs.findSimpleInterest(1000,2,5));
	System.out.println("Compound Interest yearly is : " + cs.findCompoundInterest(1500,2,5,true));
	System.out.println("Compound Interest half yearly is : " + cs.findCompoundInterest(1600,3,4,false));

}

}


/*OUTPUT:
The cost for the construction is:  Rs 360000.0
The cost for the construction is:  Rs150000.0
The cost for the construction is:  Rs270000.0
The cost for the construction is:  Rs500000.0
Simple Interest is : 100.0
Compound Interest yearly is : 153.75000000000006
Compound Interest half yearly is : 201.85987082240013
 */
 