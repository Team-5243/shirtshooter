package org.usfirst.frc.team5243.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5243.robot.commands.*;
import org.usfirst.frc.team5243.robot.subsystems.*;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	

	private final MotorSubsystem MotorSub;
	private final SolenoidSubsystem SS;
	
	private Joystick leftStick;
	private Joystick rightStick;

	
	private Button aimup;
	private Button aimdown;
	private Button pew;
	private Button pewpew;
    public OI(){
    	System.out.println("OI constructor Start");
    	
    	MotorSub  = new MotorSubsystem();
    	SS = new SolenoidSubsystem();
 		leftStick = new Joystick(0);
 		rightStick = new Joystick(1);
 		
    }
    public void init(){
 		aimup = new JoystickButton(leftStick,2);
 		aimup.whileHeld(new Aim(true));
 		aimdown = new JoystickButton(leftStick,3);
 		aimdown.whileHeld(new Aim(false));
 		
		pew = new JoystickButton(leftStick,1);
		pew.whenPressed(new Shoot());
		pewpew = new JoystickButton(rightStick,1);
		pewpew.whenPressed(new Shoot());
		
		System.out.println("OI constructor End");
		
    }
	public MotorSubsystem getMotorSS(){
		return MotorSub;
	}
	public SolenoidSubsystem getSS(){
		return SS;
	}
	public Joystick getLeftStick(){
		return leftStick;
	}
	public Joystick getRightStick(){
		return rightStick;
	}
}

