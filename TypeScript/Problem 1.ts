function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    let m : number= nums1.length;
    let n : number = nums2.length;

    let arr : number[]=[];

    for(let j = 0;j<m;j++) {
        arr.push(nums1[j]) ;
        
    }

    for(let j = 0;j<n;j++) {
        arr.push(nums2[j]) ;
    }

    let sortedArr : number[] = arr.sort((a,b)=>a-b);
    let middle:number= Math.floor(sortedArr.length/2)
    

    let res : number = 0;
    if(sortedArr.length % 2 === 0) {
        res = (sortedArr[middle] + sortedArr[middle-1])/2;
    } else {
        res = sortedArr[middle];
    }
    return res;

};
