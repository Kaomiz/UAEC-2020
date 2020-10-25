class Camera {

	static final int REQUEST_IMAGE_CAPTURE = 1;

	private void dispatchTakePictureIntent () {
		Intent takePictureIntent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
		try {
			startActivityForResult (takePictureIntent, REQUEST_IMAGE_CAPTURE);
		} catch (ActivityNotFoundException e) {
			// display error state to the user
		}
	}
}