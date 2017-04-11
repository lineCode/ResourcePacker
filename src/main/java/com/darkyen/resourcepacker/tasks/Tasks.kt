package com.darkyen.resourcepacker.tasks

/**
 * Collection of all tasks from this package in logical order.
 */
val DefaultTasks = listOf(
        IgnoreTask,
        CreateIOSIconTask,
        CreateAppleStringsTask,
        CreateFontsTask,
        PyxelTilesTask,
        ConvertModelsTask,
        FlattenTask,
        ResizeTask,
        RasterizeTask,
        PreBlendTask,
        PackTask,
        DensityPackTask,
        RemoveEmptyDirectoriesTask)