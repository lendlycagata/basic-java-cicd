module "java" {
  source     = "./modules/java"
  project_id = var.project_id
  region     = var.region
}