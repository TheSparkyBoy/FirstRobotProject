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

  public DriveTrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
