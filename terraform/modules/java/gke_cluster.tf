resource "google_container_cluster" "java-cicd-cluster" {
  name     = "java-cicd-cluster"
  location = var.region
  enable_autopilot = true
}