terraform {
  required_version = ">= 0.12.23"
}

provider "google" {
  version = "~> 3.12"
  project = "es-repo"
  region  = "us-west1"
}
