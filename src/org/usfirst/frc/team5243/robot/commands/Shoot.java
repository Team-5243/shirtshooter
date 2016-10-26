package org.usfirst.frc.team5243.robot.commands;

import org.usfirst.frc.team5243.robot.Robot;
import org.usfirst.frc.team5243.robot.subsystems.SolenoidSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {
	public SolenoidSubsystem SS;

	public boolean done;
    public Shoot() {
    	//System.out.println("Shoot");
        requires(Robot.oi.getSS());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	done = false;
    	SS = Robot.oi.getSS();
    	//System.out.println("State of the SS: " + SS.getState());
    }

    protected void execute() {
    	SS.turnOn();
    	try {
			wait(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	SS.turnOff();
    	done = true;
    	//System.out.println("gratata");
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    	done = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

}
