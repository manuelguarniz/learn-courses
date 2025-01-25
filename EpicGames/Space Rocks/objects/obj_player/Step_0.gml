/// @DnDAction : YoYo Games.Mouse & Keyboard.If_Key_Down
/// @DnDVersion : 1
/// @DnDHash : 4D9FF9D6
/// @DnDArgument : "key" "vk_up"
var l4D9FF9D6_0;l4D9FF9D6_0 = keyboard_check(vk_up);if (l4D9FF9D6_0){	/// @DnDAction : YoYo Games.Movement.Add_Motion
	/// @DnDVersion : 1
	/// @DnDHash : 2B3DC7FD
	/// @DnDParent : 4D9FF9D6
	/// @DnDArgument : "dir" "image_angle"
	/// @DnDArgument : "speed" "0.1"
	motion_add(image_angle, 0.1);}

/// @DnDAction : YoYo Games.Mouse & Keyboard.If_Key_Down
/// @DnDVersion : 1
/// @DnDHash : 1FE1F78C
/// @DnDArgument : "key" "vk_left"
var l1FE1F78C_0;l1FE1F78C_0 = keyboard_check(vk_left);if (l1FE1F78C_0){	/// @DnDAction : YoYo Games.Common.Variable
	/// @DnDVersion : 1
	/// @DnDHash : 47665247
	/// @DnDParent : 1FE1F78C
	/// @DnDArgument : "expr" "4"
	/// @DnDArgument : "expr_relative" "1"
	/// @DnDArgument : "var" "image_angle"
	image_angle += 4;}

/// @DnDAction : YoYo Games.Mouse & Keyboard.If_Key_Down
/// @DnDVersion : 1
/// @DnDHash : 5FCFEDE1
/// @DnDArgument : "key" "vk_right"
var l5FCFEDE1_0;l5FCFEDE1_0 = keyboard_check(vk_right);if (l5FCFEDE1_0){	/// @DnDAction : YoYo Games.Common.Variable
	/// @DnDVersion : 1
	/// @DnDHash : 76873AB7
	/// @DnDParent : 5FCFEDE1
	/// @DnDArgument : "expr" "-4"
	/// @DnDArgument : "expr_relative" "1"
	/// @DnDArgument : "var" "image_angle"
	image_angle += -4;}