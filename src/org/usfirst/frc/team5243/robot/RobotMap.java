package org.usfirst.frc.team5243.robot;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// Port Numbers below
	public final static int MotorFrontLeft = 9;
	public final static int MotorFrontRight = 8;
	public final static int MotorBackLeft = 6;
	public final static int MotorBackRight = 7;
	
	public final static int MotorRaiseShooter = 12;
	
	public final static int PCMPort = 2;
	public final static int Solenoid = PCMPort;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;

	
	
	// ----------------------------------- General Constants Below This ------------------
	public final static double turnspeed = .25;
	public final static double aimspeed = 1;
}
