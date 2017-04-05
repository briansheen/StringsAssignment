import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        String sample = "Knowledge is knowing" +
                " a tomato" +
                " is a fruit";
        System.out.println(sample);

        //test contains
        if (sample.contains("is")) {
            System.out.println("SUCCESS, String sample contains 'is'");
        } else {
            System.out.println("ERROR, String sample should contain 'is'");
        }
        if (sample.contains("tomatoes")) {
            System.out.println("ERROR, String sample should not contain 'tomatoes'");
        } else {
            System.out.println("SUCCESS, String sample does not contain 'tomatoes'");
        }

        //test endsWith
        if (sample.endsWith("uit")) {
            System.out.println("SUCCESS, String sample ends with 'uit'");
        } else {
            System.out.println("ERROR, String sample should end with 'uit'");
        }
        if (sample.endsWith("fruiT")) {
            System.out.println("ERROR, String sample ends with 'fruit'");
        } else {
            System.out.println("SUCCESS, String sample does not end with 'fruiT'");
        }

        //test equalsIgnoreCase
        if (sample.equalsIgnoreCase("KNOWLEDGE is knowing a TOMATO is a FRUIT")) {
            System.out.println("SUCCESS, String samples are equal ignoring case");
        } else {
            System.out.println("ERROR, String samples should equal ignoring case");
        }
        if (sample.equalsIgnoreCase(" KNOWLEDGE is knowing a TOMATO is a FRUIT")) {
            System.out.println("ERROR, String samples should not equal");
        } else {
            System.out.println("SUCCESS, String samples are not equal");
        }

        //test lastIndexOf
        if (sample.lastIndexOf("knowing") == 13) {
            System.out.println("SUCCESS, last index of 'knowing' is 13");
        } else{
            System.out.println("ERROR, last index of 'knowing' should be 13");
        }
        if(sample.lastIndexOf("knowing") >= 14 || sample.lastIndexOf("knowing") <= 12){
            System.out.println("ERROR, last index of 'knowing is 13");
        } else {
            System.out.println("SUCCESS, last index of 'knowing' is 13 only");
        }

        //test replace
        if(sample.replace("a","x").equals("Knowledge is knowing x tomxto is x fruit")) {
            System.out.println("SUCCESS, 'a' replaced with 'x'");
        } else {
            System.out.println("ERROR, a's should be x's");
        }
        if(sample.replace("a","x").equals("Knowledge is knowing x tomato is x fruit")){
            System.out.println("ERROR, all a's haven't been replaced with x's");
        } else{
            System.out.println("SUCCESS, all a's haven't been replaced with x's");
        }

        //test toLowerCase
        if(sample.toLowerCase().equals("knowledge is knowing a tomato is a fruit")){
            System.out.println("SUCCESS, all characters are now lower case");
        }else{
            System.out.println("ERROR, all characters should have been changed to be lower case");
        }
        if(sample.toLowerCase().equals("knowledge is knoWing a tomato is a fruit")){
            System.out.println("ERROR, all characters should have been changed to be lower case");
        } else{
            System.out.println("SUCCESS, all characters are all lower case");
        }

        //test isBlank
        if(StringUtils.isBlank(sample)){
            System.out.println("ERROR, sample is not blank");
        } else {
            System.out.println("SUCCESS, sample is not blank");
        }
        if(StringUtils.isBlank("     ")){
            System.out.println("SUCCESS, parameter is blank");
        } else {
            System.out.println("ERROR, parameter should be blank");
        }

        //test equalsIgnoreCase
        if(StringUtils.equalsIgnoreCase(sample,"KnowlEdGe iS knoWinG A tOmato iS a FRUIT")){
            System.out.println("SUCCESS, sample and parameter are equal ignoring case");
        } else {
            System.out.println("ERROR, sample and parameter should be equal ignoring case");
        }
        if(StringUtils.equalsIgnoreCase(sample,"KNOWLEDGE is knowing a tomato is a fruit.")) {
            System.out.println("ERROR, sample and parameter are not equal regardless of case");
        } else {
            System.out.println("SUCCESS, sample and parameter are not equal regardless of case");
        }

        //test leftPad(str,size,padChar)
        if(StringUtils.leftPad(sample,45,'a').equals("aaaaaKnowledge is knowing a tomato is a fruit")){
            System.out.println("SUCCESS, string padded with five a's");
        } else {
            System.out.println("ERROR, string not padded with five a's");
        }
        if(StringUtils.leftPad(sample,45,'a').equals("aaaaKnowledge is knowing a tomato is a fruit")){
            System.out.println("ERROR, string padded with four a's");
        } else {
            System.out.println("SUCCESS, string padded with five a's");
        }
    }
}

