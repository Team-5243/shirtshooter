
package org.usfirst.frc.team5243.robot;

import org.usfirst.frc.team5243.robot.subsystems.MotorSubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Scheduler;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public static OI oi;
	@SuppressWarnings("unused")
	private RobotDrive myDrive;
	public Robot() {
		
	}

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		oi = new OI();
		oi.init();
		myDrive = oi.getMotorSS().getDrive();
		
	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {
		
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		//LiveWindow.run();
		//SmartDashboard.putNumber("Motor RPM", oi.getMotorSS().getSpeed());
		
	}
	

	public void teleopInit() {

    }

	
	
	
	
	
	
	/**
	 * This function is called when the disabled button is hit. You can use it
	 * to reset subsystems before shutting down.
	 */
	public void disabledInit() {
		
	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		Scheduler.getInstance().run();// Never delete
		MotorSubsystem ms = oi.getMotorSS();
		if (!ms.isCommandRunning()) {
			ms.getDrive().tankDrive(oi.getLeftStick(), oi.getRightStick());

		}
		//LiveWindow.run();
		oi.getSS().getAim().set(1);
		
		
		//SmartDashboard.putNumber("Motor RPM", oi.getMotorSS().getSpeed());

	}
	
	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {
		//LiveWindow.run();
		//SmartDashboard.putNumber("Motor RPM", oi.getMotorSS().getSpeed());
	}
}