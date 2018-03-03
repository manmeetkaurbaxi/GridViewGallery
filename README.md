# GridViewGallery
Fetch images from any url online in a grid view in Android Studio and view them even when you are offline

This Android Project implements the Picasso library which converts the images at the URL to be fetched, converted into thumbnails and also 
be viewable to the user even when he/she is offline.

1. Create a Android Project with Empty Activity("Main Activity.java").
2. Now, in your Gradle Scripts(build.gradle;Module:app), add the picasso library in the dependencies i.e., "compile 'com.squareup.picasso:picasso:2.5.2'" and sync your project.
3. Now, in the "activity_main.xml", add a GridView .
4. Create a class, "ImageAdapter.java" which fetches all the images from the URL and then converts them into thumbnails for the GridView(which is currently unavailable for the Android Studio).
5. Now, create an activity, "FullImageActivity.java", which changes the thumbnail view into Full Screen Image View.
6. Add an object of the Grid View class and an object of the adapter class to the "MainActivity.java" class.
7. Lastly, add a loader of your choice to the drawable folder in res.

Thanks !
