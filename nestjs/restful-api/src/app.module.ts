import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { TypeOrmModule } from '@nestjs/typeorm';
import { CatModule } from './cat/cat.module';
import { Cat } from './cat/cat.entity';

@Module({
  imports: [TypeOrmModule.forRoot({
    "type": "postgres",
    "host": "172.29.58.214",
    "port": 5432,
    "username": "postgres",
    "password": "123456",
    "database": "restful-api",
    "entities": [Cat],
    "synchronize": true,
    "logging": true
  }), CatModule],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
