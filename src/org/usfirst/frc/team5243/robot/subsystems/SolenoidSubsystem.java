package org.usfirst.frc.team5243.robot.subsystems;


import org.usfirst.frc.team5243.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SolenoidSubsystem extends Subsystem {
    
    private Solenoid solar;
    private CANTalon aim;
    public SolenoidSubsystem(){
    	 solar = new Solenoid(RobotMap.Solenoid);
    	 aim = new CANTalon(RobotMap.MotorRaiseShooter);
    	 aim.changeControlMode(TalonControlMode.Voltage);
    	 
    }
    public void initDefaultCommand() {
        
    }
    public void moveAim(double dub){
    	aim.set(dub);
    }
    public CANTalon getAim(){
    	return aim;
    }
    public void turnOn() {
    	solar.set(true);
    }
    public void turnOff() {
    	solar.set(false);
    }
    public boolean getState() {
    	return solar.get();
    }
}

