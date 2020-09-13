# SecondsAndMinutesAndHours
# Challenge from Tim Buchalka's Java Programming Masterclass for Software Developers course.

* Create a method called getDurationString with 2 parameters, minutes and seconds.

* You should validate that the minutes >=0 and seconds is >= 0 and <= 59.

* The method should return "Invalid value" in the method if either of the above are true.

* If the parameters are valid then calculate how many hours minutes and seconds equals the
  minutes and seconds passed to this method and return that value as a string in format
  "XXh YYm ZZs" where XX represents a number of hours, YY the minutes and ZZ the seconds.
 
* Create a 2nd method of the same name but with only one parameter, seconds.

* Validate that it is >= 0, and return "Invalid value" if it is not true.

* If it is valid, then calculate how many minutes are in the seconds value and then call the other 
  overloadded method passing the correct minutes and seconds calculated so that it can
  calculate correctly
  
* Call both methods to print values to the console.

TIPS: 
  * Use int or long for your number data types..
  
  * 1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
  
  * Methods should be static.
  
BONUS: 
  * For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s.
  
