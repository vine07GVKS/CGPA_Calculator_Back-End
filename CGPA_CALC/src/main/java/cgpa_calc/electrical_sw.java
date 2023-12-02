package cgpa_calc;

import java.util.Scanner;

public class electrical_sw {
    Scanner num = new Scanner(System.in);

    public void Electrical_sw() {

        //System.out.println("--------------------------Welcome to CGPA Calculator---------------------------------");
        System.out.println();
        System.out.println("---------Welcome to Electrical and Electronics Engineering (Sandwich)----------------");

        Scanner input = new Scanner(System.in);
        Scanner sele = new Scanner(System.in);

        //  --------------------  Select number 1. Regular or 2.Lateral----------------------

        System.out.println();
        System.out.print("Select number \n1.Regular or \n2.Lateral \nEnter the number: ");
        int RegOrLat = sele.nextInt();

        switch (RegOrLat)
        {
            case 1:
            {
                System.out.println();
                System.out.println("You Selected Regular");
                System.out.println();

                System.out.print("Select Number \n1.GPA OR 2.CGPA \n\nEnter the number :");
                int GPAorCGPA = sele.nextInt();
                switch (GPAorCGPA)
                {
                    // ---------------------- GPA CALCULATION FOR REGULAR -----------------------
                    case 1:
                    {
                        System.out.println("you Selected the GPA Calculation");

                        System.out.print("Select the Semester using number , Eg:1 ");
                        int GPAnum = num.nextInt();
                        switch (GPAnum)
                        {
                            case 1:
                            {
                                System.out.println("Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Calculus and its Application :");
                                int sub1 = num.nextInt();
                                System.out.print("Physics :");
                                int sub2 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub3 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub4 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub5 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub6 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub7 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum = (sub1 * 4) + (sub2 * 3) + (sub3 * 3) + (sub4 * 2) + (sub5 * 3) + (sub6 * 2) + (sub7);
                                float gpa = sum / sem1TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 1 GPA : " + gpa);
                            }
                            break;

                            case 2:
                            {
                                System.out.println(" Enter Semester 2 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();

                                System.out.print("Complex variables and Transforms :");
                                int sub21 = num.nextInt();
                                System.out.print("Semiconductor devices :");
                                int sub22 = num.nextInt();
                                System.out.print("Applied Electrochemistry :");
                                int sub23 = num.nextInt();
                                System.out.print("Basic of Mechanical Engineering :");
                                int sub24 = num.nextInt();
                                System.out.print("Language Elective :");
                                int sub25 = num.nextInt();
                                System.out.print("Basic Sciences Laboratory :");
                                int sub26 = num.nextInt();
                                System.out.print("Engineering Practices :");
                                int sub27 = num.nextInt();

                                float sem2TotalCredit = 18;
                                float sum12 = (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float gpa12 = sum12 / sem2TotalCredit;
                                System.out.println();
                                System.out.println("-----------------");
                                System.out.println("Semester 2 GPA : " + gpa12);

                            }
                            break;
                            case 3:
                            {
                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;
                                System.out.println("-------------------");
                                System.out.println("Semester 3 GPA : " + gpa33);
                            }
                            break;

                            case 4:
                            {
                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 4 GPA : " + gpa44);
                            }
                            break;

                            case 5:
                            {
                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 5 GPA : " + gpa55);
                            }
                            break;

                            case 6:
                            {
                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 6 GPA : " + gpa66);
                            }
                            break;

                            case 7:
                            {
                                System.out.println(" Enter Semester 7 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Computer Architecture :");
                                int sub71 = num.nextInt();
                                System.out.print("Data Structure Using C++ :");
                                int sub72 = num.nextInt();
                                System.out.print("Professional Elective - 1  :");
                                int sub73 = num.nextInt();
                                System.out.print("Innovation Practices :");
                                int sub74 = num.nextInt();

                                float sem7TotalCredit = 11;
                                float sum77 = (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);
                                float gpa77 = sum77 / sem7TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 7 GPA : " + gpa77);
                            }
                            break;

                            case 8:
                            {
                                System.out.println(" Enter Semester 8 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Devices And Circuits :");
                                int sub81 = num.nextInt();
                                System.out.print("Power System Protection And Switchgear  :");
                                int sub82 = num.nextInt();
                                System.out.print("Power System Analysis :");
                                int sub83 = num.nextInt();
                                System.out.print("Professional Elective - 2 :");
                                int sub84 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub85 = num.nextInt();
                                System.out.print("Electric Devices And Circuits Laboratory :");
                                int sub86 = num.nextInt();
                                System.out.print("Power System Laboratory :");
                                int sub87 = num.nextInt();

                                float sem8TotalCredit = 18;
                                float sum88 = (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);
                                float gpa88 = sum88 / sem8TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 8 GPA : " + gpa88);
                            }
                            break;

                            case 9:
                            {
                                System.out.println(" Enter Semester 9 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Professional Elective - 3 :");
                                int sub91 = num.nextInt();
                                System.out.print("Professional Elective - 4 :");
                                int sub92 = num.nextInt();
                                System.out.print("Professional Elective - 5 :");
                                int sub93 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub94 = num.nextInt();
                                System.out.print("Project Work - 1 :");
                                int sub95 = num.nextInt();


                                float sem9TotalCredit = 14;
                                float sum99 = (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2);
                                float gpa99 = sum99 / sem9TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 9 GPA : " + gpa99);
                            }
                            break;

                            case 10:
                            {
                                System.out.println(" Enter Semester 10 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Professional Elective - 6 :");
                                int sub101 = num.nextInt();
                                System.out.print("Project Work - 2 :");
                                int sub102 = num.nextInt();

                                float sem10TotalCredit = 7;
                                float sum10 = (sub101 * 3) + (sub102 * 4);
                                float gpa10 = sum10 / sem10TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 10 GPA : " + gpa10);
                            }
                            break;
                            default:
                                throw new IndexOutOfBoundsException("You choose the wrong value ");
                        }

                    }
                    break;

                    //-----------------------     CGPG CALCULATION FOR REGULAR ------------------------------------

                    case 2:
                    {
                        System.out.print("Select Semester Number UP TO :");
                        int RegSemNum = input.nextInt();

                        switch (RegSemNum)
                        {
                            case 1:
                            {
                                System.out.println();
                                System.out.println(" Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.println("Calculus and its Application :");
                                int sub1 = num.nextInt();
                                System.out.print("Physics :");
                                int sub2 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub3 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub4 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub5 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub6 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub7 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum11 = (sub1 * 4) + (sub2 * 3) + (sub3 * 3) + (sub4 * 2) + (sub5 * 3) + (sub6 * 2) + (sub7);
                                float CGPA11 = sum11 / sem1TotalCredit;
                                System.out.println();
                                System.out.println("--------------------");
                                System.out.println("--------CGPA--------");
                                System.out.println();

                                // -------------------------- sem 1 ----------------------

                                System.out.println("CGPA of Semester 1   =  " + CGPA11);
                                System.out.println();

                            }
                            break;


                            //-------------------------------------   up to sem 2   ------------------------------------------


                            case 2:
                            {
                                System.out.println();
                                System.out.println(" Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Calculus and its Application :");
                                int sub11 = num.nextInt();
                                System.out.print("Physics :");
                                int sub12 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub13 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub14 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub15 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub16 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub17 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum11 = (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17);
                                float gpa11 = sum11 / sem1TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 2 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();

                                System.out.print("Complex variables and Transforms :");
                                int sub21 = num.nextInt();
                                System.out.print("Semiconductor devices :");
                                int sub22 = num.nextInt();
                                System.out.print("Applied Electrochemistry :");
                                int sub23 = num.nextInt();
                                System.out.print("Basic of Mechanical Engineering :");
                                int sub24 = num.nextInt();
                                System.out.print("Language Elective :");
                                int sub25 = num.nextInt();
                                System.out.print("Basic Sciences Laboratory :");
                                int sub26 = num.nextInt();
                                System.out.print("Engineering Practices :");
                                int sub27 = num.nextInt();

                                float sem2TotalCredit = 18;
                                float sum12 = (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float gpa12 = sum12 / sem2TotalCredit;

                                //  -----------------------------------------     GPA     ------------------------------------------------------

                                System.out.println("-----GPA List------ ");
                                System.out.println();
                                System.out.println("Semester 1 GPA : " + gpa11);
                                System.out.println();
                                System.out.println("Semester 2 GPA : " + gpa12);

                                // -----------------------------------------    CGPA    ---------------------------------------------------------

                                System.out.println("---------------------");
                                System.out.println("---------CGPA--------");
                                System.out.println();

                                // ------------------------- sem 1  ----------------------

                                System.out.println("CGPA of Semester 1 " + gpa11);
                                System.out.println();

                                // ----------------------- sem 2 --------------------------

                                float sem1_2TotalCredit = 36;
                                float sum1_2 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);

                                float CGPA12 = sum1_2 / sem1_2TotalCredit;
                                System.out.println("CGPA up to Semester 2   =  " + CGPA12);
                                System.out.println();


                            }
                            break;


                            //--------------------------------------   up to sem 3  ------------------------------------------


                            case 3: {
                                System.out.println(" Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Calculus and its Application :");
                                int sub11 = num.nextInt();
                                System.out.print("Physics :");
                                int sub12 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub13 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub14 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub15 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub16 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub17 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum11 = (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17);
                                float gpa11 = sum11 / sem1TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 2 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();

                                System.out.print("Complex variables and Transforms :");
                                int sub21 = num.nextInt();
                                System.out.print("Semiconductor devices :");
                                int sub22 = num.nextInt();
                                System.out.print("Applied Electrochemistry :");
                                int sub23 = num.nextInt();
                                System.out.print("Basic of Mechanical Engineering :");
                                int sub24 = num.nextInt();
                                System.out.print("Language Elective :");
                                int sub25 = num.nextInt();
                                System.out.print("Basic Sciences Laboratory :");
                                int sub26 = num.nextInt();
                                System.out.print("Engineering Practices :");
                                int sub27 = num.nextInt();

                                float sem2TotalCredit = 18;
                                float sum22 = (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float gpa22 = sum22 / sem2TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.println("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;


                                //  ---------------------------------- GPA LIST  -----------------------------------------

                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 1 GPA : " + gpa11);
                                System.out.println();
                                System.out.println("Semester 2 GPA : " + gpa22);
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("-------------------");
                                System.out.println("---------CGPA-------");
                                System.out.println();

                                //-------------------  sem 1 --------------------

                                System.out.println("CGPA of Semester 1 " + gpa11);
                                System.out.println();

                                // -------------------- sem 2  -----------------------

                                float sem1_2TotalCredit = 36;
                                float sum1_2 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);

                                float CGPA12 = sum1_2 / sem1_2TotalCredit;
                                System.out.println("CGPA up to Semester 2   =  " + CGPA12);
                                System.out.println();

                                // --------------------- sem 3  ------------------------

                                float sem1_2_3TotalCredit = 58;
                                float sum1_2_3 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA123 = sum1_2_3 / sem1_2_3TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA123);
                                System.out.println();

                            }
                            break;


                            //-----------------------------------------    up to sem 4   ------------------------------------------------------


                            case 4: {
                                System.out.println(" Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Calculus and its Application :");
                                int sub11 = num.nextInt();
                                System.out.print("Physics :");
                                int sub12 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub13 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub14 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub15 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub16 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub17 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum11 = (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17);
                                float gpa11 = sum11 / sem1TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 2 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();

                                System.out.print("Complex variables and Transforms :");
                                int sub21 = num.nextInt();
                                System.out.print("Semiconductor devices :");
                                int sub22 = num.nextInt();
                                System.out.print("Applied Electrochemistry :");
                                int sub23 = num.nextInt();
                                System.out.print("Basic of Mechanical Engineering :");
                                int sub24 = num.nextInt();
                                System.out.print("Language Elective :");
                                int sub25 = num.nextInt();
                                System.out.print("Basic Sciences Laboratory :");
                                int sub26 = num.nextInt();
                                System.out.print("Engineering Practices :");
                                int sub27 = num.nextInt();

                                float sem2TotalCredit = 18;
                                float sum22 = (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float gpa22 = sum22 / sem2TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.println("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;


                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 1 GPA : " + gpa11);
                                System.out.println();
                                System.out.println("Semester 2 GPA : " + gpa22);
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("----------------------");
                                System.out.println("---------CGPA---------");
                                System.out.println();

                                // -------------------sem 1 -------------------
                                System.out.println("CGPA of Semester 1 " + gpa11);
                                System.out.println();

                                //-------------------- sem 2 ------------------

                                float sem1_2TotalCredit = 36;
                                float sum1_2 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);

                                float CGPA12 = sum1_2 / sem1_2TotalCredit;
                                System.out.println("CGPA up to Semester 2   =  " + CGPA12);
                                System.out.println();


                                // ------------------- sem 3 -------------------

                                float sem1_2_3TotalCredit = 58;
                                float sum1_2_3 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA123 = sum1_2_3 / sem1_2_3TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA123);
                                System.out.println();

                                // ---------------------- sem 4 ------------------

                                float sem1_2_3_4TotalCredit = 78;
                                float sum1_2_3_4 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA1234 = sum1_2_3_4 / sem1_2_3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA1234);
                                System.out.println();


                            }
                            break;


                            // --------------------------   up to sem 5 CGPA FOR REGULAR -----------------------------------


                            case 5: {
                                System.out.println(" Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Calculus and its Application :");
                                int sub11 = num.nextInt();
                                System.out.print("Physics :");
                                int sub12 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub13 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub14 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub15 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub16 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub17 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum11 = (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17);
                                float gpa11 = sum11 / sem1TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 2 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();

                                System.out.print("Complex variables and Transforms :");
                                int sub21 = num.nextInt();
                                System.out.print("Semiconductor devices :");
                                int sub22 = num.nextInt();
                                System.out.print("Applied Electrochemistry :");
                                int sub23 = num.nextInt();
                                System.out.print("Basic of Mechanical Engineering :");
                                int sub24 = num.nextInt();
                                System.out.print("Language Elective :");
                                int sub25 = num.nextInt();
                                System.out.print("Basic Sciences Laboratory :");
                                int sub26 = num.nextInt();
                                System.out.print("Engineering Practices :");
                                int sub27 = num.nextInt();

                                float sem2TotalCredit = 18;
                                float sum22 = (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float gpa22 = sum22 / sem2TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.println("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                // --------------------------------------   GPA LIST   --------------------------------------

                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 1 GPA : " + gpa11);
                                System.out.println();
                                System.out.println("Semester 2 GPA : " + gpa22);
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("-----------------------");
                                System.out.println("---------CGPA----------");
                                System.out.println();

                                //   ------------------   sem 1 -------------------

                                System.out.println("CGPA of Semester 1 " + gpa11);
                                System.out.println();

                                //   ------------------   sem 2 -------------------

                                float sem1_2TotalCredit = 36;
                                float sum1_2 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float CGPA12 = sum1_2 / sem1_2TotalCredit;
                                System.out.println("CGPA up to Semester 2   =  " + CGPA12);
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem1_2_3TotalCredit = 58;
                                float sum1_2_3 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA123 = sum1_2_3 / sem1_2_3TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA123);
                                System.out.println();

                                //   ------------------   sem 4 -------------------

                                float sem1_2_3_4TotalCredit = 78;
                                float sum1_2_3_4 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA1234 = sum1_2_3_4 / sem1_2_3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA1234);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem1_2_3_4_5TotalCredit = 98;
                                float sum1_2_3_4_5 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA12345 = sum1_2_3_4_5 / sem1_2_3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA12345);
                                System.out.println();


                            }
                            break;

                            // --------------------------   up to sem 6 CGPA FOR REGULAR -----------------------------------

                            case 6: {
                                System.out.println(" Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Calculus and its Application :");
                                int sub11 = num.nextInt();
                                System.out.print("Physics :");
                                int sub12 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub13 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub14 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub15 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub16 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub17 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum11 = (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17);
                                float gpa11 = sum11 / sem1TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 2 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();

                                System.out.print("Complex variables and Transforms :");
                                int sub21 = num.nextInt();
                                System.out.print("Semiconductor devices :");
                                int sub22 = num.nextInt();
                                System.out.print("Applied Electrochemistry :");
                                int sub23 = num.nextInt();
                                System.out.print("Basic of Mechanical Engineering :");
                                int sub24 = num.nextInt();
                                System.out.print("Language Elective :");
                                int sub25 = num.nextInt();
                                System.out.println("Basic Sciences Laboratory :");
                                int sub26 = num.nextInt();
                                System.out.print("Engineering Practices :");
                                int sub27 = num.nextInt();

                                float sem2TotalCredit = 18;
                                float sum22 = (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float gpa22 = sum22 / sem2TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;

                                // ------------------------------------  GPA LIST --------------------------------------

                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 1 GPA : " + gpa11);
                                System.out.println();
                                System.out.println("Semester 2 GPA : " + gpa22);
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();
                                System.out.println("Semester 6 GPA : " + gpa66);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("------------------------");
                                System.out.println("-----------CGPA---------");
                                System.out.println();

                                //   ------------------   sem 1 -------------------

                                System.out.println("CGPA up to Semester 1   =  " + gpa11);
                                System.out.println();

                                //   ------------------   sem 2 -------------------

                                float sem1_2TotalCredit = 36;
                                float sum1_2 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float CGPA12 = sum1_2 / sem1_2TotalCredit;
                                System.out.println("CGPA up to Semester 2   =  " + CGPA12);
                                System.out.println();

                                //   ------------------   sem 3 -------------------
                                float sem1_2_3TotalCredit = 58;
                                float sum1_2_3 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA123 = sum1_2_3 / sem1_2_3TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA123);
                                System.out.println();
                                //   ------------------   sem 4 -------------------
                                float sem1_2_3_4TotalCredit = 78;
                                float sum1_2_3_4 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA1234 = sum1_2_3_4 / sem1_2_3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA1234);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem1_2_3_4_5TotalCredit = 98;
                                float sum1_2_3_4_5 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA12345 = sum1_2_3_4_5 / sem1_2_3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA12345);
                                System.out.println();
                                // -----------------------  sem 6 --------------------
                                float sem1_2_3_4_5_6TotalCredit = 115;
                                float sum1_2_3_4_5_6 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);

                                float CGPA123456 = sum1_2_3_4_5_6 / sem1_2_3_4_5_6TotalCredit;
                                System.out.println("CGPA up to Semester 6   =  " + CGPA123456);
                                System.out.println();
                            }
                            break;

                            // --------------------------   up to sem 7 CGPA FOR REGULAR -----------------------------------

                            case 7: {
                                System.out.println(" Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Calculus and its Application :");
                                int sub11 = num.nextInt();
                                System.out.print("Physics :");
                                int sub12 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub13 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub14 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub15 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub16 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub17 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum11 = (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17);
                                float gpa11 = sum11 / sem1TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 2 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();

                                System.out.print("Complex variables and Transforms :");
                                int sub21 = num.nextInt();
                                System.out.print("Semiconductor devices :");
                                int sub22 = num.nextInt();
                                System.out.print("Applied Electrochemistry :");
                                int sub23 = num.nextInt();
                                System.out.print("Basic of Mechanical Engineering :");
                                int sub24 = num.nextInt();
                                System.out.print("Language Elective :");
                                int sub25 = num.nextInt();
                                System.out.print("Basic Sciences Laboratory :");
                                int sub26 = num.nextInt();
                                System.out.print("Engineering Practices :");
                                int sub27 = num.nextInt();

                                float sem2TotalCredit = 18;
                                float sum22 = (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float gpa22 = sum22 / sem2TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 7 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Computer Architecture :");
                                int sub71 = num.nextInt();
                                System.out.print("Data Structure Using C++ :");
                                int sub72 = num.nextInt();
                                System.out.print("Professional Elective - 1  :");
                                int sub73 = num.nextInt();
                                System.out.print("Innovation Practices :");
                                int sub74 = num.nextInt();

                                float sem7TotalCredit = 11;
                                float sum77 = (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);
                                float gpa77 = sum77 / sem7TotalCredit;
                                System.out.println("--------------------------");


                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 1 GPA : " + gpa11);
                                System.out.println();
                                System.out.println("Semester 2 GPA : " + gpa22);
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();
                                System.out.println("Semester 6 GPA : " + gpa66);
                                System.out.println();
                                System.out.println("Semester 7 GPA : " + gpa77);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("----------------------");
                                System.out.println("----------CGPA--------");
                                System.out.println();

                                //   ------------------   sem 1 -------------------

                                System.out.println("CGPA up to Semester 1   =  " + gpa11);
                                System.out.println();

                                //   ------------------   sem 2 -------------------

                                float sem1_2TotalCredit = 36;
                                float sum1_2 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float CGPA12 = sum1_2 / sem1_2TotalCredit;
                                System.out.println("CGPA up to Semester 2   =  " + CGPA12);
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem1_2_3TotalCredit = 58;
                                float sum1_2_3 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA123 = sum1_2_3 / sem1_2_3TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA123);
                                System.out.println();
                                //   ------------------   sem 4 -------------------
                                float sem1_2_3_4TotalCredit = 78;
                                float sum1_2_3_4 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA1234 = sum1_2_3_4 / sem1_2_3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA1234);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem1_2_3_4_5TotalCredit = 98;
                                float sum1_2_3_4_5 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA12345 = sum1_2_3_4_5 / sem1_2_3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA12345);
                                System.out.println();
                                // -----------------------  sem 6 --------------------
                                float sem1_2_3_4_5_6TotalCredit = 115;
                                float sum1_2_3_4_5_6 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);

                                float CGPA123456 = sum1_2_3_4_5_6 / sem1_2_3_4_5_6TotalCredit;
                                System.out.println("CGPA up to Semester 6   =  " + CGPA123456);
                                System.out.println();

                                // ------------------------ sem 7 ------------------------------

                                float sem1_2_3_4_5_6_7TotalCredit = 126;
                                float sum1_2_3_4_5_6_7 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                                (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);

                                float CGPA1234567 = sum1_2_3_4_5_6_7 / sem1_2_3_4_5_6_7TotalCredit;
                                System.out.println("CGPA up to Semester 7   =  " + CGPA1234567);
                                System.out.println();
                            }
                            break;

                            // --------------------------   up to sem 8 CGPA FOR REGULAR -----------------------------------

                            case 8: {
                                System.out.println(" Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Calculus and its Application :");
                                int sub11 = num.nextInt();
                                System.out.print("Physics :");
                                int sub12 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub13 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub14 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub15 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub16 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub17 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum11 = (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17);
                                float gpa11 = sum11 / sem1TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 2 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();

                                System.out.print("Complex variables and Transforms :");
                                int sub21 = num.nextInt();
                                System.out.print("Semiconductor devices :");
                                int sub22 = num.nextInt();
                                System.out.print("Applied Electrochemistry :");
                                int sub23 = num.nextInt();
                                System.out.print("Basic of Mechanical Engineering :");
                                int sub24 = num.nextInt();
                                System.out.print("Language Elective :");
                                int sub25 = num.nextInt();
                                System.out.print("Basic Sciences Laboratory :");
                                int sub26 = num.nextInt();
                                System.out.print("Engineering Practices :");
                                int sub27 = num.nextInt();

                                float sem2TotalCredit = 18;
                                float sum22 = (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float gpa22 = sum22 / sem2TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 7 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Computer Architecture :");
                                int sub71 = num.nextInt();
                                System.out.print("Data Structure Using C++ :");
                                int sub72 = num.nextInt();
                                System.out.print("Professional Elective - 1  :");
                                int sub73 = num.nextInt();
                                System.out.print("Innovation Practices :");
                                int sub74 = num.nextInt();

                                float sem7TotalCredit = 11;
                                float sum77 = (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);
                                float gpa77 = sum77 / sem7TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");


                                System.out.println(" Enter Semester 8 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Devices And Circuits :");
                                int sub81 = num.nextInt();
                                System.out.print("Power System Protection And Switchgear  :");
                                int sub82 = num.nextInt();
                                System.out.print("Power System Analysis :");
                                int sub83 = num.nextInt();
                                System.out.print("Professional Elective - 2 :");
                                int sub84 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub85 = num.nextInt();
                                System.out.print("Electric Devices And Circuits Laboratory :");
                                int sub86 = num.nextInt();
                                System.out.print("Power System Laboratory :");
                                int sub87 = num.nextInt();

                                float sem8TotalCredit = 18;
                                float sum88 = (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);
                                float gpa88 = sum88 / sem8TotalCredit;


                                System.out.println("--------------------------");

                                // ---------------------------  GPA LIST ----------------------------------

                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 1 GPA : " + gpa11);
                                System.out.println();
                                System.out.println("Semester 2 GPA : " + gpa22);
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();
                                System.out.println("Semester 6 GPA : " + gpa66);
                                System.out.println();
                                System.out.println("Semester 7 GPA : " + gpa77);
                                System.out.println();
                                System.out.println("Semester 8 GPA : " + gpa88);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("----------------------");
                                System.out.println("----------CGPA--------");
                                System.out.println();

                                //   ------------------   sem 1 -------------------

                                System.out.println("CGPA up to Semester 1   =  " + gpa11);
                                System.out.println();

                                //   ------------------   sem 2 -------------------

                                float sem1_2TotalCredit = 36;
                                float sum1_2 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float CGPA12 = sum1_2 / sem1_2TotalCredit;
                                System.out.println("CGPA up to Semester 2   =  " + CGPA12);
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem1_2_3TotalCredit = 58;
                                float sum1_2_3 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA123 = sum1_2_3 / sem1_2_3TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA123);
                                System.out.println();
                                //   ------------------   sem 4 -------------------
                                float sem1_2_3_4TotalCredit = 78;
                                float sum1_2_3_4 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA1234 = sum1_2_3_4 / sem1_2_3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA1234);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem1_2_3_4_5TotalCredit = 98;
                                float sum1_2_3_4_5 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA12345 = sum1_2_3_4_5 / sem1_2_3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA12345);
                                System.out.println();
                                // -----------------------  sem 6 --------------------
                                float sem1_2_3_4_5_6TotalCredit = 115;
                                float sum1_2_3_4_5_6 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);

                                float CGPA123456 = sum1_2_3_4_5_6 / sem1_2_3_4_5_6TotalCredit;
                                System.out.println("CGPA up to Semester 6   =  " + CGPA123456);
                                System.out.println();

                                // ------------------------ sem 7 ------------------------------

                                float sem1_2_3_4_5_6_7TotalCredit = 126;
                                float sum1_2_3_4_5_6_7 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                                (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);

                                float CGPA1234567 = sum1_2_3_4_5_6_7 / sem1_2_3_4_5_6_7TotalCredit;
                                System.out.println("CGPA up to Semester 7   =  " + CGPA1234567);
                                System.out.println();

                                // -------------------------  sem 8 --------------------------

                                float sem1_2_3_4_5_6_7_8TotalCredit = 144;
                                float sum1_2_3_4_5_6_7_8 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                                (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                                (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);

                                float CGPA12345678 = sum1_2_3_4_5_6_7_8 / sem1_2_3_4_5_6_7_8TotalCredit;
                                System.out.println("CGPA up to Semester 8   =  " + CGPA12345678);
                                System.out.println();

                            }
                            break;

                            // --------------------------   up to sem 9 CGPA FOR REGULAR -----------------------------------

                            case 9: {
                                System.out.println(" Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Calculus and its Application :");
                                int sub11 = num.nextInt();
                                System.out.print("Physics :");
                                int sub12 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub13 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub14 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub15 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub16 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub17 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum11 = (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17);
                                float gpa11 = sum11 / sem1TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 2 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();

                                System.out.print("Complex variables and Transforms :");
                                int sub21 = num.nextInt();
                                System.out.print("Semiconductor devices :");
                                int sub22 = num.nextInt();
                                System.out.print("Applied Electrochemistry :");
                                int sub23 = num.nextInt();
                                System.out.print("Basic of Mechanical Engineering :");
                                int sub24 = num.nextInt();
                                System.out.print("Language Elective :");
                                int sub25 = num.nextInt();
                                System.out.print("Basic Sciences Laboratory :");
                                int sub26 = num.nextInt();
                                System.out.print("Engineering Practices :");
                                int sub27 = num.nextInt();

                                float sem2TotalCredit = 18;
                                float sum22 = (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float gpa22 = sum22 / sem2TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 7 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Computer Architecture :");
                                int sub71 = num.nextInt();
                                System.out.print("Data Structure Using C++ :");
                                int sub72 = num.nextInt();
                                System.out.print("Professional Elective - 1  :");
                                int sub73 = num.nextInt();
                                System.out.print("Innovation Practices :");
                                int sub74 = num.nextInt();

                                float sem7TotalCredit = 11;
                                float sum77 = (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);
                                float gpa77 = sum77 / sem7TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");


                                System.out.println(" Enter Semester 8 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Devices And Circuits :");
                                int sub81 = num.nextInt();
                                System.out.print("Power System Protection And Switchgear  :");
                                int sub82 = num.nextInt();
                                System.out.print("Power System Analysis :");
                                int sub83 = num.nextInt();
                                System.out.print("Professional Elective - 2 :");
                                int sub84 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub85 = num.nextInt();
                                System.out.print("Electric Devices And Circuits Laboratory :");
                                int sub86 = num.nextInt();
                                System.out.print("Power System Laboratory :");
                                int sub87 = num.nextInt();

                                float sem8TotalCredit = 18;
                                float sum88 = (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);
                                float gpa88 = sum88 / sem8TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");

                                System.out.println(" Enter Semester 9 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Professional Elective - 3 :");
                                int sub91 = num.nextInt();
                                System.out.print("Professional Elective - 4 :");
                                int sub92 = num.nextInt();
                                System.out.print("Professional Elective - 5 :");
                                int sub93 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub94 = num.nextInt();
                                System.out.print("Project Work - 1 :");
                                int sub95 = num.nextInt();


                                float sem9TotalCredit = 14;
                                float sum99 = (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2);
                                float gpa99 = sum99 / sem9TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");

                                // ---------------------------  GPA LIST ----------------------------------

                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 1 GPA : " + gpa11);
                                System.out.println();
                                System.out.println("Semester 2 GPA : " + gpa22);
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();
                                System.out.println("Semester 6 GPA : " + gpa66);
                                System.out.println();
                                System.out.println("Semester 7 GPA : " + gpa77);
                                System.out.println();
                                System.out.println("Semester 8 GPA : " + gpa88);
                                System.out.println();
                                System.out.println("Semester 9 GPA : " + gpa99);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("----------------------");
                                System.out.println("----------CGPA--------");
                                System.out.println();

                                //   ------------------   sem 1 -------------------

                                System.out.println("CGPA up to Semester 1   =  " + gpa11);
                                System.out.println();

                                //   ------------------   sem 2 -------------------

                                float sem1_2TotalCredit = 36;
                                float sum1_2 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float CGPA12 = sum1_2 / sem1_2TotalCredit;
                                System.out.println("CGPA up to Semester 2   =  " + CGPA12);
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem1_2_3TotalCredit = 58;
                                float sum1_2_3 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA123 = sum1_2_3 / sem1_2_3TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA123);
                                System.out.println();
                                //   ------------------   sem 4 -------------------
                                float sem1_2_3_4TotalCredit = 78;
                                float sum1_2_3_4 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA1234 = sum1_2_3_4 / sem1_2_3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA1234);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem1_2_3_4_5TotalCredit = 98;
                                float sum1_2_3_4_5 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA12345 = sum1_2_3_4_5 / sem1_2_3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA12345);
                                System.out.println();
                                // -----------------------  sem 6 --------------------
                                float sem1_2_3_4_5_6TotalCredit = 115;
                                float sum1_2_3_4_5_6 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);

                                float CGPA123456 = sum1_2_3_4_5_6 / sem1_2_3_4_5_6TotalCredit;
                                System.out.println("CGPA up to Semester 6   =  " + CGPA123456);
                                System.out.println();

                                // ------------------------ sem 7 ------------------------------

                                float sem1_2_3_4_5_6_7TotalCredit = 126;
                                float sum1_2_3_4_5_6_7 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                                (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);

                                float CGPA1234567 = sum1_2_3_4_5_6_7 / sem1_2_3_4_5_6_7TotalCredit;
                                System.out.println("CGPA up to Semester 7   =  " + CGPA1234567);
                                System.out.println();

                                // -------------------------  sem 8 --------------------------

                                float sem1_2_3_4_5_6_7_8TotalCredit = 144;
                                float sum1_2_3_4_5_6_7_8 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                                (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                                (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);

                                float CGPA12345678 = sum1_2_3_4_5_6_7_8 / sem1_2_3_4_5_6_7_8TotalCredit;
                                System.out.println("CGPA up to Semester 8   =  " + CGPA12345678);
                                System.out.println();

                                // -------------------------  sem 9 --------------------------

                                float sem1_2_3_4_5_6_7_8_9TotalCredit = 158;
                                float sum1_2_3_4_5_6_7_8_9 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                                (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                                (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87) +
                                                (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2);

                                float CGPA123456789 = sum1_2_3_4_5_6_7_8_9 / sem1_2_3_4_5_6_7_8_9TotalCredit;
                                System.out.println("CGPA up to Semester 9   =  " + CGPA123456789);
                                System.out.println();

                            }
                            break;

                            // --------------------------   up to sem 10 CGPA FOR REGULAR -----------------------------------

                            case 10: {
                                System.out.println(" Enter Semester 1 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Calculus and its Application :");
                                int sub11 = num.nextInt();
                                System.out.print("Physics :");
                                int sub12 = num.nextInt();
                                System.out.print("Chemistry of Electronic Material :");
                                int sub13 = num.nextInt();
                                System.out.print("Problem solving and C programming :");
                                int sub14 = num.nextInt();
                                System.out.print("English language Proficiency :");
                                int sub15 = num.nextInt();
                                System.out.print("Electrical Engineering Diagram :");
                                int sub16 = num.nextInt();
                                System.out.print("Problem solving and C programming Laboratory :");
                                int sub17 = num.nextInt();

                                float sem1TotalCredit = 18;
                                float sum11 = (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17);
                                float gpa11 = sum11 / sem1TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 2 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();

                                System.out.print("Complex variables and Transforms :");
                                int sub21 = num.nextInt();
                                System.out.print("Semiconductor devices :");
                                int sub22 = num.nextInt();
                                System.out.print("Applied Electrochemistry :");
                                int sub23 = num.nextInt();
                                System.out.print("Basic of Mechanical Engineering :");
                                int sub24 = num.nextInt();
                                System.out.print("Language Elective :");
                                int sub25 = num.nextInt();
                                System.out.print("Basic Sciences Laboratory :");
                                int sub26 = num.nextInt();
                                System.out.print("Engineering Practices :");
                                int sub27 = num.nextInt();

                                float sem2TotalCredit = 18;
                                float sum22 = (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float gpa22 = sum22 / sem2TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 7 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Computer Architecture :");
                                int sub71 = num.nextInt();
                                System.out.print("Data Structure Using C++ :");
                                int sub72 = num.nextInt();
                                System.out.print("Professional Elective - 1  :");
                                int sub73 = num.nextInt();
                                System.out.print("Innovation Practices :");
                                int sub74 = num.nextInt();

                                float sem7TotalCredit = 11;
                                float sum77 = (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);
                                float gpa77 = sum77 / sem7TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");


                                System.out.println(" Enter Semester 8 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Devices And Circuits :");
                                int sub81 = num.nextInt();
                                System.out.print("Power System Protection And Switchgear  :");
                                int sub82 = num.nextInt();
                                System.out.print("Power System Analysis :");
                                int sub83 = num.nextInt();
                                System.out.print("Professional Elective - 2 :");
                                int sub84 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub85 = num.nextInt();
                                System.out.print("Electric Devices And Circuits Laboratory :");
                                int sub86 = num.nextInt();
                                System.out.print("Power System Laboratory :");
                                int sub87 = num.nextInt();

                                float sem8TotalCredit = 18;
                                float sum88 = (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);
                                float gpa88 = sum88 / sem8TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");

                                System.out.println(" Enter Semester 9 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Professional Elective - 3 :");
                                int sub91 = num.nextInt();
                                System.out.print("Professional Elective - 4 :");
                                int sub92 = num.nextInt();
                                System.out.print("Professional Elective - 5 :");
                                int sub93 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub94 = num.nextInt();
                                System.out.print("Project Work - 1 :");
                                int sub95 = num.nextInt();


                                float sem9TotalCredit = 14;
                                float sum99 = (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2);
                                float gpa99 = sum99 / sem9TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");

                                System.out.println(" Enter Semester 10 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Professional Elective - 6 :");
                                int sub101 = num.nextInt();
                                System.out.print("Project Work - 2 :");
                                int sub102 = num.nextInt();

                                float sem10TotalCredit = 7;
                                float sum10 = (sub101 * 3) + (sub102 * 4);
                                float gpa10 = sum10 / sem10TotalCredit;


                                // ---------------------------  GPA LIST ----------------------------------

                                System.out.println("--------------------------");
                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 1 GPA : " + gpa11);
                                System.out.println();
                                System.out.println("Semester 2 GPA : " + gpa22);
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();
                                System.out.println("Semester 6 GPA : " + gpa66);
                                System.out.println();
                                System.out.println("Semester 7 GPA : " + gpa77);
                                System.out.println();
                                System.out.println("Semester 8 GPA : " + gpa88);
                                System.out.println();
                                System.out.println("Semester 9 GPA : " + gpa99);
                                System.out.println();
                                System.out.println("Semester 10 GPA : " + gpa10);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("----------------------");
                                System.out.println("----------CGPA--------");
                                System.out.println();

                                //   ------------------   sem 1 -------------------

                                System.out.println("CGPA up to Semester 1   =  " + gpa11);
                                System.out.println();

                                //   ------------------   sem 2 -------------------

                                float sem1_2TotalCredit = 36;
                                float sum1_2 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27);
                                float CGPA12 = sum1_2 / sem1_2TotalCredit;
                                System.out.println("CGPA up to Semester 2   =  " + CGPA12);
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem1_2_3TotalCredit = 58;
                                float sum1_2_3 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA123 = sum1_2_3 / sem1_2_3TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA123);
                                System.out.println();
                                //   ------------------   sem 4 -------------------
                                float sem1_2_3_4TotalCredit = 78;
                                float sum1_2_3_4 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA1234 = sum1_2_3_4 / sem1_2_3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA1234);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem1_2_3_4_5TotalCredit = 98;
                                float sum1_2_3_4_5 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA12345 = sum1_2_3_4_5 / sem1_2_3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA12345);
                                System.out.println();
                                // -----------------------  sem 6 --------------------
                                float sem1_2_3_4_5_6TotalCredit = 115;
                                float sum1_2_3_4_5_6 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);

                                float CGPA123456 = sum1_2_3_4_5_6 / sem1_2_3_4_5_6TotalCredit;
                                System.out.println("CGPA up to Semester 6   =  " + CGPA123456);
                                System.out.println();

                                // ------------------------ sem 7 ------------------------------

                                float sem1_2_3_4_5_6_7TotalCredit = 126;
                                float sum1_2_3_4_5_6_7 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                                (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);

                                float CGPA1234567 = sum1_2_3_4_5_6_7 / sem1_2_3_4_5_6_7TotalCredit;
                                System.out.println("CGPA up to Semester 7   =  " + CGPA1234567);
                                System.out.println();

                                // -------------------------  sem 8 --------------------------

                                float sem1_2_3_4_5_6_7_8TotalCredit = 144;
                                float sum1_2_3_4_5_6_7_8 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                                (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                                (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);

                                float CGPA12345678 = sum1_2_3_4_5_6_7_8 / sem1_2_3_4_5_6_7_8TotalCredit;
                                System.out.println("CGPA up to Semester 8   =  " + CGPA12345678);
                                System.out.println();

                                // -------------------------  sem 9 --------------------------

                                float sem1_2_3_4_5_6_7_8_9TotalCredit = 158;
                                float sum1_2_3_4_5_6_7_8_9 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                                (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                                (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87) +
                                                (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2);

                                float CGPA123456789 = sum1_2_3_4_5_6_7_8_9 / sem1_2_3_4_5_6_7_8_9TotalCredit;
                                System.out.println("CGPA up to Semester 9   =  " + CGPA123456789);
                                System.out.println();

                                // -------------------------  sem 10 --------------------------

                                float sem1_2_3_4_5_6_7_8_9_10TotalCredit = 165;
                                float sum1_2_3_4_5_6_7_8_9_10 =
                                        (sub11 * 4) + (sub12 * 3) + (sub13 * 3) + (sub14 * 2) + (sub15 * 3) + (sub16 * 2) + (sub17) +
                                                (sub21 * 4) + (sub22 * 3) + (sub23 * 3) + (sub24 * 3) + (sub25 * 2) + (sub26 * 2) + (sub27) +
                                                (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                                (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                                (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                                (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                                (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87) +
                                                (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2) +
                                                (sub101 * 3) + (sub102 * 4);

                                float CGPA12345678910 = sum1_2_3_4_5_6_7_8_9_10 / sem1_2_3_4_5_6_7_8_9_10TotalCredit;
                                System.out.println("CGPA up to Semester 10  =  " + CGPA12345678910);
                                System.out.println();

                            }
                            break;
                        }
                    }
                    break;
                }


            }
            break;


            //------------------------------------------------------------------------------------------------------
            //------------------------------------------- LATERAL --------------------------------------------------
            //------------------------------------------------------------------------------------------------------


            case 2:
            {
                System.out.println();
                System.out.println("You Selected LATERAL");
                System.out.println();


                System.out.print("Select Number \n1.GPA OR \t2.CGPA \n\nEnter the number :");
                int GPAorCGPA = sele.nextInt();
                switch (GPAorCGPA)
                {
                    // ---------------------- GPA CALCULATION FOR REGULAR -----------------------
                    case 1:
                    {
                        System.out.println("Select the Semester using number , Eg:1 ");
                        int GPAnum = num.nextInt();
                        switch (GPAnum)
                        {
                            case 1: {
                                throw new IndexOutOfBoundsException("Your Selected the LATERAL so NO GPA for Semester 1  ");
                            }
                            case 2: {
                                throw new IndexOutOfBoundsException("Your Selected the LATERAL so NO GPA for Semester 2  ");
                            }
                            case 3: {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;
                                System.out.println();
                                System.out.println("--------------------------");
                                System.out.println("Semester 3 GPA : " + gpa33);
                            }
                            break;

                            case 4: {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 4 GPA : " + gpa44);
                            }
                            break;
                            case 5: {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 5 GPA : " + gpa55);
                            }
                            break;

                            case 6: {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 6 GPA : " + gpa66);
                            }
                            break;

                            case 7: {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 7 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Computer Architecture :");
                                int sub71 = num.nextInt();
                                System.out.print("Data Structure Using C++ :");
                                int sub72 = num.nextInt();
                                System.out.print("Professional Elective - 1  :");
                                int sub73 = num.nextInt();
                                System.out.print("Innovation Practices :");
                                int sub74 = num.nextInt();

                                float sem7TotalCredit = 11;
                                float sum77 = (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);
                                float gpa77 = sum77 / sem7TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 7 GPA : " + gpa77);
                            }
                            break;

                            case 8: {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 8 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Devices And Circuits :");
                                int sub81 = num.nextInt();
                                System.out.print("Power System Protection And Switchgear  :");
                                int sub82 = num.nextInt();
                                System.out.print("Power System Analysis :");
                                int sub83 = num.nextInt();
                                System.out.print("Professional Elective - 2 :");
                                int sub84 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub85 = num.nextInt();
                                System.out.print("Electric Devices And Circuits Laboratory :");
                                int sub86 = num.nextInt();
                                System.out.print("Power System Laboratory :");
                                int sub87 = num.nextInt();

                                float sem8TotalCredit = 18;
                                float sum88 = (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);
                                float gpa88 = sum88 / sem8TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 8 GPA : " + gpa88);
                            }
                            break;

                            case 9: {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 9 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Professional Elective - 3 :");
                                int sub91 = num.nextInt();
                                System.out.print("Professional Elective - 4 :");
                                int sub92 = num.nextInt();
                                System.out.print("Professional Elective - 5 :");
                                int sub93 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub94 = num.nextInt();
                                System.out.print("Project Work - 1 :");
                                int sub95 = num.nextInt();


                                float sem9TotalCredit = 14;
                                float sum99 = (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2);
                                float gpa99 = sum99 / sem9TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 9 GPA : " + gpa99);
                            }
                            break;

                            case 10: {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 10 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Professional Elective - 6 :");
                                int sub101 = num.nextInt();
                                System.out.print("Project Work - 2 :");
                                int sub102 = num.nextInt();

                                float sem10TotalCredit = 7;
                                float sum10 = (sub101 * 3) + (sub102 * 4);
                                float gpa10 = sum10 / sem10TotalCredit;
                                System.out.println("--------------------------");
                                System.out.println("Semester 10 GPA : " + gpa10);
                            }
                            break;

                            default:
                                System.out.println("You Enter the Invalid Number" + GPAnum);
                        }

                    }
                    break;

                    //-----------------------     CGPA CALCULATION FOR LATERAL  ------------------------------------

                    case 2:
                    {
                        System.out.print("Select Semester Number up to :");
                        int LATsemNum = input.nextInt();

                        switch (LATsemNum) {
                            case 1: {
                                throw new IndexOutOfBoundsException("Your selected the LATERAL so NO GPA for semester 1  ");
                            }

                            //-------------------------------------   up to sem 2   ------------------------------------------


                            case 2: {
                                throw new IndexOutOfBoundsException("Your selected the LATERAL so NO GPA for semester 2  ");
                            }

                            //--------------------------------------   up to sem 3  ------------------------------------------


                            case 3: {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.println("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;


                                //  ---------------------------------- GPA LIST  -----------------------------------------

                                System.out.println("--------------------------");
                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("-------------------------");
                                System.out.println("---------CGPA LIST-------");
                                System.out.println();


                                // --------------------- sem 3  ------------------------

                                float sem03TotalCredit = 22;
                                float sum3 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA3 = sum3 / sem03TotalCredit;
                                System.out.println("CGPA of Semester 3       =  " + CGPA3);
                                System.out.println();

                            }
                            break;


                            //-----------------------------------------    up to sem 4   ------------------------------------------------------


                            case 4: {
                                System.out.println("------------------");
                                System.out.println("Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.println("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println("Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;


                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("-----------------------------");
                                System.out.println("--------- CGPA LIST ---------");
                                System.out.println();

                                // ------------------- sem 3 -------------------

                                float sem03TotalCredit = 22;
                                float sum3 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA3 = sum3 / sem03TotalCredit;
                                System.out.println("CGPA of Semester 3      =  " + CGPA3);
                                System.out.println();

                                // ---------------------- sem 4 ------------------

                                float sem3_4TotalCredit = 42;
                                float sum3_4 =
                                        (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                                (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA34 = sum3_4 / sem3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA34);
                                System.out.println();


                            }
                            break;


                            // --------------------------   up to sem 5 CGPA FOR REGULAR -----------------------------------


                            case 5:
                            {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.println("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                // --------------------------------------   GPA LIST   --------------------------------------

                                System.out.println("--------------------------");
                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("-----------------------");
                                System.out.println("---------CGPA----------");
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem03TotalCredit = 22;
                                float sum3 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA3 = sum3 / sem03TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA3);
                                System.out.println();

                                //   ------------------   sem 4 -------------------

                                float sem3_4TotalCredit = 42;
                                float sum3_4 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA34 = sum3_4 / sem3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA34);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem3_4_5TotalCredit = 62;
                                float sum3_4_5 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA345 = sum3_4_5 / sem3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA345);
                                System.out.println();
                            }
                            break;

                            // --------------------------   up to sem 6 CGPA FOR REGULAR -----------------------------------

                            case 6:
                            {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;

                                // ------------------------------------  GPA LIST --------------------------------------

                                System.out.println("--------------------------");
                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();
                                System.out.println("Semester 6 GPA : " + gpa66);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("------------------------");
                                System.out.println("-----------CGPA---------");
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem03TotalCredit = 22;
                                float sum3 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA3 = sum3 / sem03TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA3);
                                System.out.println();

                                //   ------------------   sem 4 -------------------

                                float sem3_4TotalCredit = 42;
                                float sum3_4 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA34 = sum3_4 / sem3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA34);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem3_4_5TotalCredit = 62;
                                float sum3_4_5 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA345 = sum3_4_5 / sem3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA345);
                                System.out.println();

                                // -----------------------  sem 6 --------------------

                                float sem3_4_5_6TotalCredit = 79;
                                float sum3_4_5_6 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);

                                float CGPA3456 = sum3_4_5_6 / sem3_4_5_6TotalCredit;
                                System.out.println("CGPA up to Semester 6   =  " + CGPA3456);
                                System.out.println();
                            }
                            break;

                            // --------------------------   up to sem 7 CGPA FOR REGULAR -----------------------------------

                            case 7:
                            {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 7 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Computer Architecture :");
                                int sub71 = num.nextInt();
                                System.out.print("Data Structure Using C++ :");
                                int sub72 = num.nextInt();
                                System.out.print("Professional Elective - 1  :");
                                int sub73 = num.nextInt();
                                System.out.print("Innovation Practices :");
                                int sub74 = num.nextInt();

                                float sem7TotalCredit = 11;
                                float sum77 = (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);
                                float gpa77 = sum77 / sem7TotalCredit;

                                System.out.println();
                                System.out.println("--------------------------");
                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();
                                System.out.println("Semester 6 GPA : " + gpa66);
                                System.out.println();
                                System.out.println("Semester 7 GPA : " + gpa77);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("----------------------");
                                System.out.println("----------CGPA--------");
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem03TotalCredit = 22;
                                float sum3 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA3 = sum3 / sem03TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA3);
                                System.out.println();

                                //   ------------------   sem 4 -------------------

                                float sem3_4TotalCredit = 42;
                                float sum3_4 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA34 = sum3_4 / sem3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA34);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem3_4_5TotalCredit = 62;
                                float sum3_4_5 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA345 = sum3_4_5 / sem3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA345);
                                System.out.println();

                                // -----------------------  sem 6 --------------------

                                float sem3_4_5_6TotalCredit = 79;
                                float sum3_4_5_6 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);

                                float CGPA3456 = sum3_4_5_6 / sem3_4_5_6TotalCredit;
                                System.out.println("CGPA up to Semester 6   =  " + CGPA3456);
                                System.out.println();

                                // ------------------------ sem 7 ------------------------------

                                float sem3_4_5_6_7TotalCredit = 90;
                                float sum3_4_5_6_7 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                        (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);

                                float CGPA34567 = sum3_4_5_6_7 / sem3_4_5_6_7TotalCredit;
                                System.out.println("CGPA up to Semester 7   =  " + CGPA34567);
                                System.out.println();
                            }
                            break;

                            // --------------------------   up to sem 8 CGPA FOR REGULAR -----------------------------------

                            case 8:
                            {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 7 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Computer Architecture :");
                                int sub71 = num.nextInt();
                                System.out.print("Data Structure Using C++ :");
                                int sub72 = num.nextInt();
                                System.out.print("Professional Elective - 1  :");
                                int sub73 = num.nextInt();
                                System.out.print("Innovation Practices :");
                                int sub74 = num.nextInt();

                                float sem7TotalCredit = 11;
                                float sum77 = (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);
                                float gpa77 = sum77 / sem7TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");


                                System.out.println(" Enter Semester 8 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Devices And Circuits :");
                                int sub81 = num.nextInt();
                                System.out.print("Power System Protection And Switchgear  :");
                                int sub82 = num.nextInt();
                                System.out.print("Power System Analysis :");
                                int sub83 = num.nextInt();
                                System.out.print("Professional Elective - 2 :");
                                int sub84 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub85 = num.nextInt();
                                System.out.print("Electric Devices And Circuits Laboratory :");
                                int sub86 = num.nextInt();
                                System.out.print("Power System Laboratory :");
                                int sub87 = num.nextInt();

                                float sem8TotalCredit = 18;
                                float sum88 = (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);
                                float gpa88 = sum88 / sem8TotalCredit;


                                // ---------------------------  GPA LIST ----------------------------------
                                System.out.println();
                                System.out.println("--------------------------");
                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();
                                System.out.println("Semester 6 GPA : " + gpa66);
                                System.out.println();
                                System.out.println("Semester 7 GPA : " + gpa77);
                                System.out.println();
                                System.out.println("Semester 8 GPA : " + gpa88);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("----------------------");
                                System.out.println("----------CGPA--------");
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem03TotalCredit = 22;
                                float sum3 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA3 = sum3 / sem03TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA3);
                                System.out.println();

                                //   ------------------   sem 4 -------------------

                                float sem3_4TotalCredit = 42;
                                float sum3_4 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA34 = sum3_4 / sem3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA34);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem3_4_5TotalCredit = 62;
                                float sum3_4_5 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA345 = sum3_4_5 / sem3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA345);
                                System.out.println();

                                // -----------------------  sem 6 --------------------

                                float sem3_4_5_6TotalCredit = 79;
                                float sum3_4_5_6 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);

                                float CGPA3456 = sum3_4_5_6 / sem3_4_5_6TotalCredit;
                                System.out.println("CGPA up to Semester 6   =  " + CGPA3456);
                                System.out.println();

                                // ------------------------ sem 7 ------------------------------

                                float sem3_4_5_6_7TotalCredit = 90;
                                float sum3_4_5_6_7 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                        (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);

                                float CGPA34567 = sum3_4_5_6_7 / sem3_4_5_6_7TotalCredit;
                                System.out.println("CGPA up to Semester 7   =  " + CGPA34567);
                                System.out.println();

                                // -------------------------  sem 8 --------------------------

                                float sem3_4_5_6_7_8TotalCredit = 108;
                                float sum3_4_5_6_7_8 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                        (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                        (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);

                                float CGPA345678 = sum3_4_5_6_7_8 / sem3_4_5_6_7_8TotalCredit;
                                System.out.println("CGPA up to Semester 8   =  " + CGPA345678);
                                System.out.println();

                            }
                            break;

                            // --------------------------   up to sem 9 CGPA FOR REGULAR -----------------------------------

                            case 9:
                            {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 7 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Computer Architecture :");
                                int sub71 = num.nextInt();
                                System.out.print("Data Structure Using C++ :");
                                int sub72 = num.nextInt();
                                System.out.print("Professional Elective - 1  :");
                                int sub73 = num.nextInt();
                                System.out.print("Innovation Practices :");
                                int sub74 = num.nextInt();

                                float sem7TotalCredit = 11;
                                float sum77 = (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);
                                float gpa77 = sum77 / sem7TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");


                                System.out.println(" Enter Semester 8 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Devices And Circuits :");
                                int sub81 = num.nextInt();
                                System.out.print("Power System Protection And Switchgear  :");
                                int sub82 = num.nextInt();
                                System.out.print("Power System Analysis :");
                                int sub83 = num.nextInt();
                                System.out.print("Professional Elective - 2 :");
                                int sub84 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub85 = num.nextInt();
                                System.out.print("Electric Devices And Circuits Laboratory :");
                                int sub86 = num.nextInt();
                                System.out.print("Power System Laboratory :");
                                int sub87 = num.nextInt();

                                float sem8TotalCredit = 18;
                                float sum88 = (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);
                                float gpa88 = sum88 / sem8TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");

                                System.out.println(" Enter Semester 9 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Professional Elective - 3 :");
                                int sub91 = num.nextInt();
                                System.out.print("Professional Elective - 4 :");
                                int sub92 = num.nextInt();
                                System.out.print("Professional Elective - 5 :");
                                int sub93 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub94 = num.nextInt();
                                System.out.print("Project Work - 1 :");
                                int sub95 = num.nextInt();


                                float sem9TotalCredit = 14;
                                float sum99 = (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2);
                                float gpa99 = sum99 / sem9TotalCredit;



                                // ---------------------------  GPA LIST ----------------------------------


                                System.out.println("--------------------------");
                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();
                                System.out.println("Semester 6 GPA : " + gpa66);
                                System.out.println();
                                System.out.println("Semester 7 GPA : " + gpa77);
                                System.out.println();
                                System.out.println("Semester 8 GPA : " + gpa88);
                                System.out.println();
                                System.out.println("Semester 9 GPA : " + gpa99);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("----------------------");
                                System.out.println("----------CGPA--------");
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem03TotalCredit = 22;
                                float sum3 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA3 = sum3 / sem03TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA3);
                                System.out.println();

                                //   ------------------   sem 4 -------------------

                                float sem3_4TotalCredit = 42;
                                float sum3_4 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA34 = sum3_4 / sem3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA34);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem3_4_5TotalCredit = 62;
                                float sum3_4_5 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA345 = sum3_4_5 / sem3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA345);
                                System.out.println();

                                // -----------------------  sem 6 --------------------

                                float sem3_4_5_6TotalCredit = 79;
                                float sum3_4_5_6 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);

                                float CGPA3456 = sum3_4_5_6 / sem3_4_5_6TotalCredit;
                                System.out.println("CGPA up to Semester 6   =  " + CGPA3456);
                                System.out.println();

                                // ------------------------ sem 7 ------------------------------

                                float sem3_4_5_6_7TotalCredit = 90;
                                float sum3_4_5_6_7 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                        (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);

                                float CGPA34567 = sum3_4_5_6_7 / sem3_4_5_6_7TotalCredit;
                                System.out.println("CGPA up to Semester 7   =  " + CGPA34567);
                                System.out.println();

                                // -------------------------  sem 8 --------------------------

                                float sem3_4_5_6_7_8TotalCredit = 108;
                                float sum3_4_5_6_7_8 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                        (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                        (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);

                                float CGPA345678 = sum3_4_5_6_7_8 / sem3_4_5_6_7_8TotalCredit;
                                System.out.println("CGPA up to Semester 8   =  " + CGPA345678);
                                System.out.println();

                                // -------------------------  sem 9 --------------------------

                                float sem3_4_5_6_7_8_9TotalCredit = 122;
                                float sum3_4_5_6_7_8_9 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                        (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                        (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87) +
                                        (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2);

                                float CGPA3456789 = sum3_4_5_6_7_8_9 / sem3_4_5_6_7_8_9TotalCredit;
                                System.out.println("CGPA up to Semester 9   =  " + CGPA3456789);
                                System.out.println();

                            }
                            break;

                            // --------------------------   up to sem 10 CGPA FOR REGULAR -----------------------------------

                            case 10:
                            {
                                System.out.println("------------------");
                                System.out.println(" Enter Semester 3 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Circuit :");
                                int sub31 = num.nextInt();
                                System.out.print("Linear Algebra and Numeric Analysis :");
                                int sub32 = num.nextInt();
                                System.out.print("Electromagnetic Theory :");
                                int sub33 = num.nextInt();
                                System.out.print("DC Machines and Transformer :");
                                int sub34 = num.nextInt();
                                System.out.print("Economics for Engineers :");
                                int sub35 = num.nextInt();
                                System.out.print("Circuits & Devices Laboratory :");
                                int sub36 = num.nextInt();
                                System.out.print("DC Machines and Transformer Laboratory :");
                                int sub37 = num.nextInt();
                                System.out.print("Building Communication Skills :");
                                int sub38 = num.nextInt();

                                float sem3TotalCredit = 22;
                                float sum33 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);
                                float gpa33 = sum33 / sem3TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 4 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Network Theory :");
                                int sub41 = num.nextInt();
                                System.out.print("Electronic Circuits :");
                                int sub42 = num.nextInt();
                                System.out.print("Probability And Statistics :");
                                int sub43 = num.nextInt();
                                System.out.print("Measurements And Instrumentation :");
                                int sub44 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines :");
                                int sub45 = num.nextInt();
                                System.out.print("Electric Circuit Laboratory :");
                                int sub46 = num.nextInt();
                                System.out.print("Induction And Synchronous Machines Laboratory :");
                                int sub47 = num.nextInt();
                                System.out.print("Soft Skills Development  :");
                                int sub48 = num.nextInt();

                                float sem4TotalCredit = 20;
                                float sum44 = (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);
                                float gpa44 = sum44 / sem4TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");

                                System.out.println(" Enter Semester 5 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Digital Electronics :");
                                int sub51 = num.nextInt();
                                System.out.print("Control System :");
                                int sub52 = num.nextInt();
                                System.out.print("Electrical Power Generation Systems :");
                                int sub53 = num.nextInt();
                                System.out.print("Linear Integrated Circuits :");
                                int sub54 = num.nextInt();
                                System.out.print("Power Electronics And Application :");
                                int sub55 = num.nextInt();
                                System.out.print("Instrumentation And Control Laboratory :");
                                int sub56 = num.nextInt();
                                System.out.print("Digital Electronics Laboratory :");
                                int sub57 = num.nextInt();
                                System.out.print("Business And Managerial Communication :");
                                int sub58 = num.nextInt();

                                float sem5TotalCredit = 20;
                                float sum55 = (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);
                                float gpa55 = sum55 / sem5TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 6 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Embedded Controllers :");
                                int sub61 = num.nextInt();
                                System.out.print("Electrical Machines Design :");
                                int sub62 = num.nextInt();
                                System.out.print("Digital Signal Processing :");
                                int sub63 = num.nextInt();
                                System.out.print("Transmission And Distribution :");
                                int sub64 = num.nextInt();
                                System.out.print("Power Electronics And Embedded Controllers Laboratory :");
                                int sub65 = num.nextInt();
                                System.out.print("Digital Signal Processing And Linear Integrated Circuits Laboratory :");
                                int sub66 = num.nextInt();
                                System.out.print("Quantitative And Reasoning Skills :");
                                int sub67 = num.nextInt();

                                float sem6TotalCredit = 17;
                                float sum66 = (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);
                                float gpa66 = sum66 / sem6TotalCredit;

                                System.out.println("------------------------");
                                System.out.println("------------------------");


                                System.out.println(" Enter Semester 7 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Computer Architecture :");
                                int sub71 = num.nextInt();
                                System.out.print("Data Structure Using C++ :");
                                int sub72 = num.nextInt();
                                System.out.print("Professional Elective - 1  :");
                                int sub73 = num.nextInt();
                                System.out.print("Innovation Practices :");
                                int sub74 = num.nextInt();

                                float sem7TotalCredit = 11;
                                float sum77 = (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);
                                float gpa77 = sum77 / sem7TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");


                                System.out.println(" Enter Semester 8 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Electric Devices And Circuits :");
                                int sub81 = num.nextInt();
                                System.out.print("Power System Protection And Switchgear  :");
                                int sub82 = num.nextInt();
                                System.out.print("Power System Analysis :");
                                int sub83 = num.nextInt();
                                System.out.print("Professional Elective - 2 :");
                                int sub84 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub85 = num.nextInt();
                                System.out.print("Electric Devices And Circuits Laboratory :");
                                int sub86 = num.nextInt();
                                System.out.print("Power System Laboratory :");
                                int sub87 = num.nextInt();

                                float sem8TotalCredit = 18;
                                float sum88 = (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);
                                float gpa88 = sum88 / sem8TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");

                                System.out.println(" Enter Semester 9 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Professional Elective - 3 :");
                                int sub91 = num.nextInt();
                                System.out.print("Professional Elective - 4 :");
                                int sub92 = num.nextInt();
                                System.out.print("Professional Elective - 5 :");
                                int sub93 = num.nextInt();
                                System.out.print("Open Elective - 1 :");
                                int sub94 = num.nextInt();
                                System.out.print("Project Work - 1 :");
                                int sub95 = num.nextInt();


                                float sem9TotalCredit = 14;
                                float sum99 = (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2);
                                float gpa99 = sum99 / sem9TotalCredit;


                                System.out.println("--------------------------");
                                System.out.println("--------------------------");

                                System.out.println(" Enter Semester 10 ");
                                System.out.println();
                                System.out.println("Enter the correct value minimum value is '6'  & maximum value 10");
                                System.out.println();
                                System.out.print("Professional Elective - 6 :");
                                int sub101 = num.nextInt();
                                System.out.print("Project Work - 2 :");
                                int sub102 = num.nextInt();

                                float sem10TotalCredit = 7;
                                float sum10 = (sub101 * 3) + (sub102 * 4);
                                float gpa10 = sum10 / sem10TotalCredit;


                                // ---------------------------  GPA LIST ----------------------------------

                                System.out.println("--------------------------");
                                System.out.println("-------GPA List---------- ");
                                System.out.println();
                                System.out.println("Semester 3 GPA : " + gpa33);
                                System.out.println();
                                System.out.println("Semester 4 GPA : " + gpa44);
                                System.out.println();
                                System.out.println("Semester 5 GPA : " + gpa55);
                                System.out.println();
                                System.out.println("Semester 6 GPA : " + gpa66);
                                System.out.println();
                                System.out.println("Semester 7 GPA : " + gpa77);
                                System.out.println();
                                System.out.println("Semester 8 GPA : " + gpa88);
                                System.out.println();
                                System.out.println("Semester 9 GPA : " + gpa99);
                                System.out.println();
                                System.out.println("Semester 10 GPA : " + gpa10);
                                System.out.println();


                                // ------------------------------------  CGPA LIST  --------------------------------------

                                System.out.println("----------------------");
                                System.out.println("----------CGPA--------");
                                System.out.println();

                                //   ------------------   sem 3 -------------------

                                float sem03TotalCredit = 22;
                                float sum3 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2);

                                float CGPA3 = sum3 / sem03TotalCredit;
                                System.out.println("CGPA up to Semester 3   =  " + CGPA3);
                                System.out.println();

                                //   ------------------   sem 4 -------------------

                                float sem3_4TotalCredit = 42;
                                float sum3_4 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48);

                                float CGPA34 = sum3_4 / sem3_4TotalCredit;
                                System.out.println("CGPA up to Semester 4   =  " + CGPA34);
                                System.out.println();

                                //   ------------------   sem 5 -------------------

                                float sem3_4_5TotalCredit = 62;
                                float sum3_4_5 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58);

                                float CGPA345 = sum3_4_5 / sem3_4_5TotalCredit;
                                System.out.println("CGPA up to Semester 5   =  " + CGPA345);
                                System.out.println();

                                // -----------------------  sem 6 --------------------

                                float sem3_4_5_6TotalCredit = 79;
                                float sum3_4_5_6 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67);

                                float CGPA3456 = sum3_4_5_6 / sem3_4_5_6TotalCredit;
                                System.out.println("CGPA up to Semester 6   =  " + CGPA3456);
                                System.out.println();

                                // ------------------------ sem 7 ------------------------------

                                float sem3_4_5_6_7TotalCredit = 90;
                                float sum3_4_5_6_7 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                        (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74);

                                float CGPA34567 = sum3_4_5_6_7 / sem3_4_5_6_7TotalCredit;
                                System.out.println("CGPA up to Semester 7   =  " + CGPA34567);
                                System.out.println();

                                // -------------------------  sem 8 --------------------------

                                float sem3_4_5_6_7_8TotalCredit = 108;
                                float sum3_4_5_6_7_8 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                        (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                        (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87);

                                float CGPA345678 = sum3_4_5_6_7_8 / sem3_4_5_6_7_8TotalCredit;
                                System.out.println("CGPA up to Semester 8   =  " + CGPA345678);
                                System.out.println();

                                // -------------------------  sem 9 --------------------------

                                float sem3_4_5_6_7_8_9TotalCredit = 122;
                                float sum3_4_5_6_7_8_9 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                        (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                        (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87) +
                                        (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2);

                                float CGPA3456789 = sum3_4_5_6_7_8_9 / sem3_4_5_6_7_8_9TotalCredit;
                                System.out.println("CGPA up to Semester 9   =  " + CGPA3456789);
                                System.out.println();

                                // -------------------------  sem 10 --------------------------

                                float sem3_4_5_6_7_8_9_10TotalCredit = 129;
                                float sum3_4_5_6_7_8_9_10 = (sub31 * 4) + (sub32 * 4) + (sub33 * 3) + (sub34 * 3) + (sub35 * 3) + (sub36 * 2) + (sub37) + (sub38 * 2) +
                                        (sub41 * 4) + (sub42 * 3) + (sub43 * 3) + (sub44 * 3) + (sub45 * 3) + (sub46) + (sub47 * 2) + (sub48) +
                                        (sub51 * 4) + (sub52 * 3) + (sub53 * 3) + (sub54 * 3) + (sub55 * 4) + (sub56) + (sub57) + (sub58) +
                                        (sub61 * 3) + (sub62 * 4) + (sub63 * 3) + (sub64 * 4) + (sub65) + (sub66) + (sub67) +
                                        (sub71 * 3) + (sub72 * 4) + (sub73 * 3) + (sub74) +
                                        (sub81 * 3) + (sub82 * 3) + (sub83 * 4) + (sub84 * 3) + (sub85 * 3) + (sub86) + (sub87) +
                                        (sub91 * 3) + (sub92 * 3) + (sub93 * 3) + (sub94 * 3) + (sub95 * 2) +
                                        (sub101 * 3) + (sub102 * 4);

                                float CGPA345678910 = sum3_4_5_6_7_8_9_10 / sem3_4_5_6_7_8_9_10TotalCredit;
                                System.out.println("CGPA up to Semester 10  =  " + CGPA345678910);
                                System.out.println();
                            }
                            break;
                        }
                    }
                    break;
                }
            }

        }


    }
}







