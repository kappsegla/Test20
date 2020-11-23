#Tire Pressure Alarm
Write the unit tests for the Alarm class.
The Alarm class is designed to monitor tire pressure and set an alarm if the pressure falls outside of the expected range. The Sensor class provided for the exercise fakes the behaviour of a real tire sensor, providing random but realistic values.

##Test Doubles
To be able to write a test for the Alarm class we need to use a Test Double for the Sensor class.
We could write our own or use a mocking framework like [Mockito](https://site.mockito.org/)