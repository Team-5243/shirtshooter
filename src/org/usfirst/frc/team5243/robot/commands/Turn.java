package org.usfirst.frc.team5243.robot.commands;

import org.usfirst.frc.team5243.robot.Robot;
import org.usfirst.frc.team5243.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Turn extends Command {
	private boolean left;
	public Turn(boolean turnleft) {
		left = turnleft;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		
	}

	public void start() {
		Robot.oi.getMotorSS().setRunning(true);
		if(left){
			Robot.oi.getMotorSS().turnLeft(RobotMap.turnspeed);
		}else{
			Robot.oi.getMotorSS().turnRight(RobotMap.turnspeed);
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.oi.getMotorSS().setAll(0);
		Robot.oi.getMotorSS().setRunning(false);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
