towerOfHanoi = (rodCount, fromDisk, toDisk, auxDisk) => {
    if (rodCount === 1 ) {
       console.log(`Move ${rodCount} from ${fromDisk} to ${toDisk}`);
       return;
    }
    towerOfHanoi(rodCount-1, fromDisk, auxDisk, toDisk);
    console.log(`Move ${rodCount} from ${fromDisk} to ${toDisk}`);
    towerOfHanoi(rodCount-1, auxDisk, toDisk, fromDisk);
}

towerOfHanoi(3, 'A', 'C', 'B');
