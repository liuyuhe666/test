import { HttpException, Injectable } from "@nestjs/common";
import { InjectRepository } from "@nestjs/typeorm";
import { Repository } from "typeorm";

import { Cat } from "./cat.entity";

@Injectable()
export class CatService {
    constructor(
        // 注入对应类型的存储库实例
        @InjectRepository(Cat) private readonly catRepo: Repository<Cat>,
    ) {}

    // 添加
    async createCat(cat: Cat): Promise<Cat> {
        delete cat.id;
        return this.catRepo.save(this.catRepo.create(cat));
    }
    // 删除
    async deleteCat(id: number): Promise<void> {
        await this.findOneById(id);
        this.catRepo.delete(id);
    }
    // 修改
    async updateCat(id: number, cat: Cat): Promise<void> {
        const existCat = await this.findOneById(id);
        existCat.nickname = cat && cat.nickname ? cat.nickname : existCat.nickname;
        existCat.species = cat && cat.species ? cat.species : existCat.species;
        this.catRepo.save(existCat);
    }
    // 根据 id 查询
    async findOneCat(id: number): Promise<Cat> {
        return this.findOneById(id)
    }

    async findOneById(id: number): Promise<Cat> {
        const catInfo = await this.catRepo.findOneBy({ id });
        if (!catInfo) {
            throw new HttpException(`id=${id}的猫咪不存在`, 404)
        }
        return catInfo;
    }
}