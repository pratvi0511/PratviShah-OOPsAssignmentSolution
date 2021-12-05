# Graded Assessment-1 [OOPS]

Problem Statement

→ The assignment will contain 4 departments as four different object classes
                i) Super Department
               ii) Admin Department
               iii) Hr Department
               iv) Tech Department

→ Super Department class will be the superclass and all other departments must extend it.

→ Super department will contain 4 methods of return type String and will not accept any parameter
            i)  departmentName 
            ii)  getTodaysWork  
            iii) getWorkDeadline
            iv) isTodayAHoliday

<br />departmentName will return “ Super Department “
<br />getTodaysWork will return  “ No Work as of now”
<br />getWorkDeadline will return “ Nil “
<br />isTodayAHoliday will return “ Today is not a holiday”

→ Admin department will contain 3 methods of return type String and will not accept any parameter
            i)  departmentName 
            ii)  getTodaysWork  
            iii) getWorkDeadline
              
<br />departmentName will return “ Admin Department “
<br />getTodaysWork will return “Complete your documents Submission”
<br />getWorkDeadline will return “ Complete by EOD “


→ Hr department will contain 4 methods of return type String and will not accept any parameter
           i)  departmentName 
           ii)  getTodaysWork  
           iii) getWorkDeadline
           iv) doActivity

<br />departmentName will return “ Hr Department “
<br />getTodaysWork will return  “ Fill today’s timesheet and mark your attendance”
<br />getWorkDeadline will return “ Complete by EOD “
<br />doActivity “team Lunch”

→ Tech department will contain 4 methods of return type String and will not accept any parameter
             i)  departmentName 
             ii)  getTodaysWork  
             iii) getWorkDeadline
             iv) getTechStackInformation

<br />departmentName will return “ Tech Department “
<br />getTodaysWork will return  “ Complete coding of module 1”
<br />getWorkDeadline will return “ Complete by EOD “
<br />getTechStackInformation will return “core Java”

→ Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
<br />→ Each department will display all its functionalities.
<br />→ Each department  will display whether today is a holiday or not with the help of the Super Department. (SuperDepartment will act as a super class for all the departments)


----------------------------------------------------------------------------------------------------------------


Expected Output

Welcome to Admin Department
<br />Complete your documents submission
<br />Complete by EOD 
<br />Today is not a Holiday

Welcome to HR Department
<br />team Lunch
<br />Fill today’s timesheet and mark your attendance
<br />Complete by EOD 
<br />Today is not a Holiday


Welcome to Tech Department
<br />Complete coding of Module 1
<br />Complete by EOD 
<br />Core Java 
<br />Today is not a Holiday
