// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //motor id's
    public static final int FrontRightID = 0;
    public static final int FrontLeftID = 3;
    public static final int BackRightID = 5;
    public static final int BackLeftID = 2;

    //controller joystick id's
    public static final int XBOX_R_XAXIS = 4;
    public static final int XBOX_R_YAXIS = 5;
    public static final int XBOX_L_XAXIS = 0;
    public static final int XBOX_L_YAXIS = 1;
    public static final int XBOX_LT = 2;
    public static final int XBOX_RT = 3;

    //controller pin
    public static final int XBOX1_Pin = 0;
    public static final int XBOX2_Pin = 1;
}
