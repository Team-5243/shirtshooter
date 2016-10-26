package org.usfirst.frc.team5243.robot.commands;

import org.usfirst.frc.team5243.robot.Robot;
import org.usfirst.frc.team5243.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Aim extends Command {
	private CANTalon aim;
	private boolean up;
	private boolean done;
    public Aim(boolean paramup) {
        requires(Robot.oi.getSS());
        up = paramup;
        done = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	aim = Robot.oi.getSS().getAim();
    	aim.changeControlMode(TalonControlMode.Voltage);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if(up){
    		aim.set(RobotMap.aimspeed);
    	}else{
    		aim.set(RobotMap.aimspeed);
    	}
    	done = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    	aim.set(0);
    	done = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
}
