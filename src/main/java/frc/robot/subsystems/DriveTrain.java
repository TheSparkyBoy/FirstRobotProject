// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private final TalonFX FrontRight = new TalonFX(Constants.FrontRightID);
  private final TalonFX BackRight = new TalonFX(Constants.BackRightID);
  private final TalonFX FrontLeft = new TalonFX(Constants.FrontLeftID);
  private final TalonFX BackLeft = new TalonFX(Constants.BackLeftID);

  //constructor
  public DriveTrain() {
    FrontRight.setInverted(false);
    FrontLeft.setInverted(true);
    BackRight.setInverted(false);
    BackLeft.setInverted(true);
    FrontLeft.configReverseSoftLimitEnable(false);
    FrontLeft.configForwardSoftLimitEnable(false);
    FrontRight.configReverseSoftLimitEnable(false);
    FrontRight.configForwardSoftLimitEnable(false);
    BackLeft.configReverseSoftLimitEnable(false);
    BackLeft.configForwardSoftLimitEnable(false);
    BackRight.configReverseSoftLimitEnable(false);
    BackRight.configForwardSoftLimitEnable(false);
  }

  //method
    public void setRightSpeed(double speed){
      FrontRight.set(ControlMode.PercentOutput, speed);
      BackRight.set(ControlMode.PercentOutput, speed);
    }

    public void setLeftSpeed(double speed){
      
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
