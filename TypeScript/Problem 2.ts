class LRUCache {
     capacity: number;
     cache: Array<[number,number]> = [];
    constructor(capacity: number) {
        if (capacity < 0) 
            this.capacity = -capacity;
        else
            this.capacity = capacity;
    }

    get(key: number): number {
        for(let i =0;i<this.cache.length; i++) {
            let arr = this.cache[i];
            if (arr[0] === key) {
                this.cache.splice(i,1);
                this.cache.unshift(arr);
                return arr[1];
            }
        }
        return -1;
    }

    put(key: number, value: number): void {
        for (let i =0; i<this.cache.length; i++) {
            let arr2 = this.cache[i];
            if(arr2[0]===key){
                arr2[1] = value;
                this.cache.splice(i,1);
                this.cache.unshift(arr2);
                return;
            } 
        }
        let arr: [number,number] = [key,value];
        if (this.capacity ===0) {
            this.cache.pop();
            this.cache.unshift(arr);
        } else {
                this.cache.unshift(arr);
                this.capacity--;
            }
    }
}
